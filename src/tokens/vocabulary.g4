lexer grammar vocabulary;

//data types
REAL : 'Real' ;

BOOL : 'Bool' ;

STRING : 'string';

SEPARATOR: ';';

TXT : '"' .*? '"';

INT : ('0'..'9')+ ;
HEX :  '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ;
FLOAT: [0-9]+'.'[0-9]+;

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

AND : 'and';

OR : 'or';

NOT : 'not';

XOR : 'xor';

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
TRUE : 'true';

FALSE : 'false';

//keywords
IF : 'if';

THEN : 'then';

BEGIN : 'Begin';

END : 'End';

WHILE : 'While';

ELSE : 'Else';

READ : 'read';

WRITE : 'write';

MODULE : 'Module';

INPUT : 'Input';

OUTPUT : 'Output';

//identifier
IDENTIFIER : [a-zA-Z] ([a-zA-Z]|('0'..'9')|'_'|'.')* ;




