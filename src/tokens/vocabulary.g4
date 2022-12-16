grammar vocabulary;

//lexer part
//data types in case sensitive
REAL : [rR][eE][aA][lL] ;

BOOL : [bB][oO][oO][lL] ;

STRING : [sS][tT][rR][iI][nN][gG] ;

SEPARATOR: ';';

TXT : '"' ~[\n]*? '"';

REAL_INT : ('0'..'9')+ ;
REAL_HEX :  '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ;
REAL_FLOAT: [0-9]*'.'[0-9]+;

// one line comments
ONCOMMENT: '%%' ~[\r\n]*;

// multi line comments
MLCOMMENT: '%%%' .*? '%%%';

//white spaces
WS : [ \t\r\n]+ -> skip;

//operators
PLUS : '+';

MINUS : '-';

MULT : '*';

DIV : '/';

POW : '^';

FAC : '!';

ASSIGN : '=';

AND : [aA][nN][dD];

OR : [oO][rR];

NOT : [nN][oO][tT];

XOR : [xX][oO][rR];

REMAIN : '%';

COND_IF : '?';

COLON : ':';

EQUAL : '==';

GREQUAL : '>=';

LEEQUAL : '<=';

NOTEQUAL : '<>';

GREATER : '>';

LESS : '<';

PARENTHESIS_OPEN: '(';

PARENTHESIS_CLOSE: ')';

//constant values
TRUE : [tT][rR][uU][eE];

FALSE : [fF][aA][lL][sS][eE];

//keywords
IF : [iI][fF];

THEN : [tT][hH][eE][nN];

ELSE : [eE][lL][sS][eE];

BEGIN : [bB][eE][gG][iI][nN];

END : [eE][nN][dD];

WHILE : [wW][hH][iI][lL][eE];

READ : [rR][eE][aA][dD];

WRITE : [wW][rR][iI][tT][eE];

MODULE : [mM][oO][dD][uU][lL][eE];

INPUT : [iI][nN][pP][uU][tT];

OUTPUT : [oO][uU][tT][pP][uU][tT];

ERROR: .;

RETURN: [rR][eE][tT][uU][rR][nN] ;

//identifier
IDENTIFIER : [a-zA-Z] ([a-zA-Z]|('0'..'9')|'_'|'.')* ;

//error handling
OTHER : . ;

// parser part

//not completed
stat
 : assign
 | ifCondition
 | variableDeclarator
 | whileLoop
 | write
 | read
 | callModule
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

variableDeclarator
    : IDENTIFIER COLON (REAL | BOOL | STRING) SEPARATOR ;

assign : IDENTIFIER ASSIGN boolExp SEPARATOR | IDENTIFIER ASSIGN textExp SEPARATOR | IDENTIFIER ASSIGN mathExp SEPARATOR ;

boolExp : TRUE | FALSE ;

textExp : TXT | textExp PLUS textExp ;

op : PLUS | MINUS | REMAIN | DIV | POW | MULT ;

//not complete
mathExp : REAL_FLOAT | REAL_HEX | REAL_INT | PARENTHESIS_OPEN mathExp PARENTHESIS_CLOSE | mathExp op mathExp;

read : READ IDENTIFIER boolExp SEPARATOR | READ IDENTIFIER  textExp SEPARATOR | READ IDENTIFIER  mathExp SEPARATOR ;

write : WRITE boolExp SEPARATOR | WRITE textExp SEPARATOR | WRITE mathExp SEPARATOR;

//not complete
ifCondition : IF PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE THEN codeBlock (ELSE boolExp)? codeBlock;

//not complete
whileLoop : WHILE PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE codeBlock ;

codeBlock : stat* ;

createModule : MODULE IDENTIFIER INPUT COLON (IDENTIFIER)* SEPARATOR OUTPUT COLON (REAL | BOOL | STRING) BEGIN codeBlock returnValue? END ;

returnValue : RETURN (mathExp | boolExp | textExp) ;

callModule : IDENTIFIER PARENTHESIS_OPEN (IDENTIFIER)* PARENTHESIS_CLOSE ;

