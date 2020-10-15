grammar Bot;
@header {

	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
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

program: sentence*;

//condiciones
condition:; //falta hacer todas las combinaciones de las condiciones
if_conditional: IF condition ARROW_RIGHT sentence* END SEMICOLON;
//if_else_conditional:
//	IF condition ARROW_RIGHT sentence* ELSE sentence* END SEMICOLON
//	{if((boolean)$condition.value){
//		
//	}else{
//		
//	}
//	};

//ciclos
while_cicle:
	WHILE PARENTHESIS condition RIGHTPARENTHESIS ARROW_RIGHT sentence* END SEMICOLON;

//funciones

parameters: VAR ID COMMA?;
function:
	DEFINE ID PARENTHESIS parameters* RIGHTPARENTHESIS ARROW_RIGHT sentence* END SEMICOLON;

//movimiento del robot---------------------------------------
up_movement:
	UP expression SEMICOLON {bot.up((int)$expression.value);};
left_movement:
	LEFT expression SEMICOLON {bot.left((int)$expression.value);};
right_movement:
	RIGHT expression SEMICOLON {bot.right((int)$expression.value);};
down_movement:
	DOWN expression SEMICOLON {bot.down((int)$expression.value);};
//recoger y soltar------------------------------------------------
pick: PICK SEMICOLON {bot.pick();};
drop: DROP SEMICOLON {bot.drop();};

//variables declaracion y asignacion
declaration: VAR ID SEMICOLON {symbolTable.put($ID.text,0);};
assign:
	ID ASSIGN (expression {symbolTable.put($ID.text, $expression.value);} |arithmetic {symbolTable.put($ID.text, $arithmetic.value);}) SEMICOLON ;
both:
	VAR ID ASSIGN (expression {symbolTable.put($ID.text, $expression.value);} |arithmetic {symbolTable.put($ID.text, $arithmetic.value);}) SEMICOLON;

//impresion y lectura por pantalla
output:
	DOLLAR (
		expression {System.out.println($expression.value);}
		| arithmetic {System.out.println($arithmetic.value);}
	) SEMICOLON;

expression
	returns[Object value]:
	dato {$value =  $dato.value;}
	| ID {$value =  symbolTable.get($ID.text);};

//expresiones aritmeticas
arithmetic
	returns[Object value]:
	t1 = factor {$value= (int)$t1.value;} (
		PLUS t2 = factor {$value=(int)$value + (int)$t2.value;}
		| SUBTRACTION t2 = factor {$value=(int)$value - (int)$t2.value;}
	)*;

factor
	returns[Object value]:
	t1 = term {$value= (int)$t1.value;} (
		MULTIPLICATION t2 = term {$value=(int)$value * (int)$t2.value;}
		| DIVISION t2 = term {$value=(int)$value / (int)$t2.value;}
	)*;
term
	returns[Object value]:
	NUMBER {$value =  Integer.parseInt($NUMBER.text);}
	| ID {$value =  symbolTable.get($ID.text);}
	| PARENTHESIS arithmetic {$value =  $arithmetic.value;} RIGHTPARENTHESIS;

// constantes y tipos de datos
dato
	returns[Object value]:
	STRING {$value =  $STRING.text;}
	| FALSE {$value =  false;}
	| TRUE {$value =  true;}
	| NUMBER {$value =  Integer.parseInt($NUMBER.text);}
	| FLOAT {$value =  Float.parseFloat($FLOAT.text);};

comment: COMMENT STRING;

sentence:
	down_movement
	| up_movement
	| left_movement
	| right_movement
	| pick
	| drop
	| output
	| comment
	| declaration
	| assign
	| both;

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

