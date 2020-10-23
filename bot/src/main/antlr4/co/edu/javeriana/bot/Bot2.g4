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
	}
	 (sentence{body.add($sentence.node);})*
	{
		for(ASTNode n: body){
			n.execute();
		}
	};


//sentence:
//	down_movement
//	| up_movement
//	| left_movement
//	| right_movement
//	| pick
//	| drop
//	| output
//	| comment
//	| declaration
//	| assign
//	| both;

sentence returns[ASTNode node]:
	output{$node =$output.node;}
	|comment
	|if_else_conditional{$node =$if_else_conditional.node;}
	| down_movement {$node =$down_movement.node;}
	| up_movement {$node =$up_movement.node;}
	| left_movement {$node =$left_movement.node;}
	| right_movement {$node =$right_movement.node;};
	
//condiciones
condition returns[ASTNode node]:; //falta hacer todas las combinaciones de las condiciones

if_else_conditional returns[ASTNode node]:
	IF (expression) ARROW_RIGHT 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
		(s1=sentence{body.add($s1.node);})* 
	ELSE
	{
		List<ASTNode> elseBody = new ArrayList<ASTNode>();
	} 
		(s2=sentence{elseBody.add($s2.node);})* 
	END SEMICOLON
	{
		$node= new If($expression.node,body,elseBody);
	};


//if_conditional returns[ASTNode node]: 
//	IF arithmetic ARROW_RIGHT 
//	{
//		List<ASTNode> body = new ArrayList<ASTNode>();
//		List<ASTNode> elseBody = new ArrayList<ASTNode>();
//	}
//		(s1=sentence{body.add($s1.node);})* 
//	END SEMICOLON
//	{
//		$node= new If($arithmetic.node,body,elseBody);
//	};

	

//ciclos
while_cicle returns[ASTNode node]:
	WHILE PARENTHESIS condition RIGHTPARENTHESIS ARROW_RIGHT sentence* END SEMICOLON;


//funciones

parameters returns[ASTNode node]: VAR ID COMMA?;
function returns[ASTNode node]:
	DEFINE ID PARENTHESIS parameters* RIGHTPARENTHESIS ARROW_RIGHT sentence* END SEMICOLON;

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
pick returns[ASTNode node]: PICK SEMICOLON {};
drop returns[ASTNode node]: DROP SEMICOLON {};


//variables declaracion y asignacion
//declaration: VAR ID SEMICOLON {symbolTable.put($ID.text,0);};
//assign:
//	ID ASSIGN (expression {symbolTable.put($ID.text, $expression.value);} |arithmetic {symbolTable.put($ID.text, $arithmetic.value);}) SEMICOLON ;
//both:
//	VAR ID ASSIGN (expression {symbolTable.put($ID.text, $expression.value);} |arithmetic {symbolTable.put($ID.text, $arithmetic.value);}) SEMICOLON;

//impresion y lectura por pantalla
output returns[ASTNode node]:
	DOLLAR (
		expression {$node = new Output($expression.node);}
	) SEMICOLON;

expression
	returns[ASTNode node]:
	dato {$node = $dato.node;}
	| arithmetic {$node = $arithmetic.node;};
	//| ID {};

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
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
	| FALSE {$node = new Constant(false);}
	| TRUE {$node = new Constant(true);}
	| PARENTHESIS arithmetic {$node =$arithmetic.node;} RIGHTPARENTHESIS;

// constantes y tipos de datos
dato
	returns[ASTNode node]:
	STRING {$node = new Constant($STRING.text);}
	| FALSE {$node = new Constant(false);}
	| TRUE {$node = new Constant(true);}
	| NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
	| FLOAT {$node = new Constant(Float.parseFloat($FLOAT.text));};

comment: COMMENT STRING;


//tokens---------------------------------------------------

STRING: '"' (~'"')+ '"';
TRUE: '@T';
FALSE: '@F';
NUMBER: [0-9]+;
FLOAT: NUMBER '.' NUMBER*;
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

DEFINE: 'define';

WHILE: 'while';

BR_OPEN: '{';
BR_CLOSE: '}';
VAR: '\'';
ID: [a-zA-z_][a-zA-z0-9_]*;

WS: [ \t\r\n]+ -> skip;


