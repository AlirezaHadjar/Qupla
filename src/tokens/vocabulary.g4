lexer grammar vocabulary;

//data types in case sensitive
REAL : [rR][eE][aA][lL] ;

BOOL : [bB][oO][oO][lL] ;

STRING : [sS][tT][rR][iI][nN][gG] ;

SEPARATOR: ';';

TXT : '"' .*? '"';

REAL_INT : ('0'..'9')+ ;
REAL_HEX :  '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ;
REAL_FLOAT: [0-9]+'.'[0-9]+;

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

Div : '/';

POW : '^';

FAC : '!';

ASSIGN : '=';

AND : [aA][nN][dD];

OR : [oO][rR];

NOT : [nN][oO][tT];

XOR : [xX][oO][rR];

REMAIN : '%';

COND_IF : '?';

COND_ELSE : ':';

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

//identifier
IDENTIFIER : [a-zA-Z] ([a-zA-Z]|('0'..'9')|'_'|'.')* ;




