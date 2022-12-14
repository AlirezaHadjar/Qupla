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


FOR: [fF][oO][rR] ;

CLASS: [cC][lL][aA][sS][sS] ;

CONSTRUCTOR: [cC][oO][nN][sS][tT][rR][uU][cC][tT][oO][rR] ;

DESTRUCTOR: [dD][eE][sS][tT][rR][uU][cC][tT][oO][rR] ;

BREAK: [bB][rR][eE][aA][kK] ;

CONTINUE: [cC][oO][nN][tT][iI][nN][uU][eE] ;

SWITCH: [sS][wW][iI][tT][cC][hH] ;

CASE: [cC][aA][sS][eE] ;

PROTECTED: [pP][rR][oO][tT][eE][cC][tT][eE][dD] ;

PRIVATE: [pP][rR][iI][vV][aA][tT][eE] ;

PUBLIC: [pP][uU][bB][lL][iI][cC] ;

THIS: [tT][hH][iI][sS] ;

RETURN: [rR][eE][tT][uU][rR][nN] ;

TRY: [tT][rR][yY] ;

CATCH: [cC][aA][tT][cC][hH] ;

FINALLY: [fF][iI][nN][aA][lL][lL][yY] ;

THROW: [tT][hH][rR][oO][wW] ;

NEW: [nN][eE][wW] ;

DELETE: [dD][eE][lL][eE][tT][eE] ;

INCLUDE: [iI][nN][cC][lL][uU][dD][eE] ;

USING: [uU][sS][iI][nN][gG] ;

NAMESPACE: [nN][aA][mM][eE][sS][pP][aA][cC][eE] ;

IMPORT: [iI][mM][pP][oO][rR][tT] ;

EXTENDS: [eE][xX][tT][eE][nN][dD][sS] ;

INTERFACE: [iI][nN][tT][eE][rR][fF][aA][cC][eE] ;

ENUM: [eE][nN][uU][mM] ;

STATIC: [sS][tT][aA][tT][iI][cC] ;

ABSTRACT: [aA][bB][sS][tT][rR][aA][cC][tT] ;

FINAL: [fF][iI][nN][aA][lL] ;

CONST: [cC][oO][nN][sS][tT] ;

DO: [dD][oO] ;

DEFAULT: [dD][eE][fF][aA][uU][lL][tT] ;

IMPLEMENTS: [iI][mM][pP][lL][eE][mM][eE][nN][tT][sS] ;

SUPER: [sS][uU][pP][eE][rR] ;

THROWS: [tT][hH][rR][oO][wW][sS] ;

VOID: [vV][oO][iI][dD] ;

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
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

variableDeclarator
    : IDENTIFIER COLON REAL SEPARATOR| IDENTIFIER COLON BOOL SEPARATOR| IDENTIFIER COLON STRING SEPARATOR ;

assign : IDENTIFIER ASSIGN boolExp SEPARATOR | IDENTIFIER ASSIGN textExp SEPARATOR | IDENTIFIER ASSIGN mathExp SEPARATOR ;

boolExp : TRUE | FALSE ;

textExp : TXT | textExp PLUS textExp ;

//not complete
mathExp : REAL_FLOAT | REAL_HEX | REAL_INT | PARENTHESIS_OPEN mathExp PARENTHESIS_CLOSE | mathExp op mathExp;

op : PLUS | MINUS | REMAIN | DIV | POW | MULT ;

read : READ IDENTIFIER boolExp SEPARATOR | READ IDENTIFIER  textExp SEPARATOR | READ IDENTIFIER  mathExp SEPARATOR ;

write : WRITE boolExp SEPARATOR | WRITE textExp SEPARATOR | WRITE mathExp SEPARATOR;

//not complete
ifCondition : IF PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE THEN codeBlock (ELSE boolExp)? codeBlock;

//not complete
whileLoop : WHILE PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE codeBlock ;

codeBlock : stat* ;

