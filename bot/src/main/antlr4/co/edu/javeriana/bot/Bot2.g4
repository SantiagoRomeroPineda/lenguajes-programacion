grammar Bot;
@header {
	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import co.edu.javeriana.bot.ast.*;
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
	private Bot bot;
	
	public BotParser(TokenStream input, Bot bot) {
		this(input);
		this.bot = bot;
	}

}

// Los tokens se escriben a continuación de estos comentarios. Todo lo que esté en líneas previas a
// lo modificaremos cuando hayamos visto Análisis Sintáctico

program:
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Context context= new Context();
	}
	 (sentence{body.add($sentence.node);})*
	{
		for(ASTNode n: body){
			n.execute(context);
		}
	};

sentence returns[ASTNode node]:
	output{$node =$output.node;}
	|function_declaration{$node = $function_declaration.node;}
	|function_call{$node = $function_call.node;}
	| if_else_conditional{$node =$if_else_conditional.node;}
	| while_cicle{$node = $while_cicle.node;}
	| down_movement {$node =$down_movement.node;}
	| up_movement {$node =$up_movement.node;}
	| left_movement {$node =$left_movement.node;}
	| right_movement {$node =$right_movement.node;}
	| declaration{$node =$declaration.node;}
	| assignment{$node =$assignment.node;}
	| both {$node =$both.node;}
	| pick {$node =$pick.node;}
	| drop {$node =$drop.node;}
	| input {$node =$input.node;}
	;
	
/*
 * condition //returns [ASTNode node]:
:	 (expression COMPARISON_EXPRESSIONS expression)*
	|PARENTHESIS condition RIGHTPARENTHESIS
	|NOT condition
	|condition LOGICAL_EXPRESSIONS condition;
*/
if_else_conditional returns[ASTNode node]:
	IF logic ARROW_RIGHT 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		List<ASTNode> elseBody = new ArrayList<ASTNode>();
	}
		(s1=sentence{body.add($s1.node);})* 
	(ELSE
		(s2=sentence{elseBody.add($s2.node);})*)?
	END SEMICOLON
	{
		$node= new If($logic.node,body,elseBody);
	};

//ciclos 
while_cicle returns[ASTNode node]:
	WHILE  logic  ARROW_RIGHT 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
		(s1 = sentence{body.add($s1.node);})* 
	 END SEMICOLON
	{
		$node = new While($logic.node,body);
	};

//funciones
//parameters returns[ASTNode node]: VAR ID COMMA? {$node = $ID.text;};

function_declaration returns[ASTNode node]:
	{
		List<String> head = new ArrayList<String>();
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	DEFINE ID PARENTHESIS (VAR i1=ID {head.add($i1.text);} COMMA?)* RIGHTPARENTHESIS ARROW_RIGHT
		(s1 = sentence{body.add($s1.node);})*
		{$node = new FunDeclaration($ID.text,head,body);}
	END SEMICOLON;

function_call returns[ASTNode node]:
	ID PARENTHESIS 
	{
		List<ASTNode> head = new ArrayList<ASTNode>();	
	}
	(e1=expression{head.add($e1.node);})(COMMA e2=expression{head.add($e2.node);})* {$node = new FunCall($ID.text,head);} RIGHTPARENTHESIS SEMICOLON;

//movimiento del robot---------------------------------------
up_movement returns[ASTNode node]:
	UP expression SEMICOLON {$node= new MoveUp(bot,$expression.node);};
left_movement returns[ASTNode node]:
	LEFT expression SEMICOLON {$node= new MoveLeft(bot,$expression.node);};
right_movement returns[ASTNode node]:
	RIGHT expression SEMICOLON {$node= new MoveRight(bot,$expression.node);};
down_movement returns[ASTNode node]:
	DOWN expression SEMICOLON {$node= new MoveDown(bot,$expression.node);};
//recoger y soltar------------------------------------------------
pick returns[ASTNode node]: PICK SEMICOLON {$node= new Pick(bot);};
drop returns[ASTNode node]: DROP SEMICOLON {$node= new Drop(bot);};


//variables declaracion y asignacion
declaration returns[ASTNode node]: 
	VAR ID SEMICOLON 
	{$node = new  Declaration($ID.text);};
assignment returns[ASTNode node]:
	ID ASSIGN expression SEMICOLON 
	{$node = new  Assignment($ID.text, $expression.node);};
both returns[ASTNode node]:
	VAR ID ASSIGN expression  SEMICOLON
	{$node = new  Assignment($ID.text, $expression.node);};

//impresion y lectura por pantalla
output returns[ASTNode node]:
	DOLLAR 
		{
			List<ASTNode> cu = new ArrayList<ASTNode>();
		}
		((prin=expression{cu.add($prin.node);})PLUS?)* 
	 SEMICOLON
	 {
	 	$node = new Output(cu);
	 };

input returns[ASTNode node]:
	QUESTION ID SEMICOLON
	 {
	 	{$node = new  Input($ID.text);};
	 };



expression
	returns[ASTNode node]:
	arithmetic {$node = $arithmetic.node;}
	| dato {$node = $dato.node;}
	| ID {$node = new VarReference($ID.text);};

//expresiones aritmeticas
arithmetic
	returns[ASTNode node]:
	t1 = factor {$node = $t1.node;} (
		PLUS t2 = factor {$node = new Addition($node,$t2.node);}
		| SUBTRACTION t2 = factor {$node = new Substraction($node,$t2.node);}
	)*;

factor
	returns[ASTNode node]:
	t1 = term {$node = $t1.node;} (
		MULTIPLICATION t2 = term {$node = new Multiplication($node,$t2.node);}
		| DIVISION t2 = term {$node = new Division($node,$t2.node);}
	)*;
term
	returns[ASTNode node]:
	NUMBER {$node = new Constant(Double.parseDouble($NUMBER.text));}
	| FALSE {$node = new Constant(false);}
	| TRUE {$node = new Constant(true);}
	| ID  {$node = new VarReference($ID.text);}
	| PARENTHESIS arithmetic {$node =$arithmetic.node;} RIGHTPARENTHESIS;

// constantes y tipos de datos
dato
	returns[ASTNode node]:
	STRING {$node = new Constant($STRING.text);}
	| FALSE {$node = new Constant(false);}
	| TRUE {$node = new Constant(true);}
	| NUMBER {$node = new Constant(Double.parseDouble($NUMBER.text));}
	//| FLOAT {$node = new Constant(Float.parseFloat($FLOAT.text));}
	;
	

	
logic returns[ASTNode node]: c1 = comparation {$node=$c1.node;} (AND c2 = comparation {$node = new And($node,$c2.node);} | logic_or {$node = new Or($node,$logic_or.node);})*;

logic_or returns[ASTNode node]: OR comparation {$node=$comparation.node;} ;

comparation returns[ASTNode node] :
	/*NOT?*/	(e1 = expression {$node = $e1.node;} (
		 LEFT		 e2 = expression	{$node = new Minor($e1.node,$e2.node);}
	|	 RIGHT 		 e3 = expression	{$node = new Mayor($e1.node,$e3.node);}
	|	 MINOREQ	 e4 = expression	{$node = new Minoreq($e1.node,$e4.node);}
	|	 MAYOREQ	 e5 = expression	{$node = new Mayoreq($e1.node,$e5.node);}
	|	 EQUAL		 e6 = expression	{$node = new Equal($e1.node,$e6.node);}
	|	 NOTEQUAL	 e7 = expression	{$node = new Notequal($e1.node,$e7.node);})?
	|	PARENTHESIS logic{$node=$logic.node;} RIGHTPARENTHESIS)
	| 	not {$node=$not.node;};

not returns[ASTNode node]: NOT comparation {$node = new Not($comparation.node);};


comment: COMMENT STRING;


//tokens---------------------------------------------------

STRING: '"' (~'"')+ '"';
TRUE: '@T';
FALSE: '@F';
NUMBER: [0-9]+('.'[0-9]+)?;
//FLOAT: NUMBER '.' NUMBER*;
BOOLEAN: '@' [t|f];

COMMENT: '#';


UP: '^';
LEFT: '<';
RIGHT: '>';
DOWN: 'V';
DROP: 'D';
PICK: 'P';
SEMICOLON: ';';
PLUS: '+';
SUBTRACTION: '-';
MULTIPLICATION: '*';
DIVISION: '/';
COMMA: ',';

ASSIGN: '<-';

QUESTION: '?';
DOLLAR: '$';

IF: 'if';
ELSE: 'else';
ARROW_RIGHT: '->';
END: 'end';

AND: '&';
OR: '|';
NOT: '!';
MINOR: '<';
MAYOR: '>';
MINOREQ: '<=';
MAYOREQ: '>=';
EQUAL: '=';
NOTEQUAL: '<>';
PARENTHESIS: '(';
RIGHTPARENTHESIS: ')';

/*
 COMPARISON_EXPRESSIONS:
	  MINOR
	| MAYOR
	| MINOREQ
	| MAYOREQ
	| EQUAL
	| NOTEQUAL;
	
LOGICAL_EXPRESSIONS: AND|OR;
 
 */

DEFINE: 'define';

WHILE: 'while';

BR_OPEN: '{';
BR_CLOSE: '}';
VAR: '\'';
ID: [a-zA-z_][a-zA-z0-9_]*;

WS: [ \t\r\n]+ -> skip;
