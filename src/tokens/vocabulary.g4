lexer grammar vocabulary;

//data types
REAL : 'Real' ;

BOOL : 'Bool' ;

STRING : 'String';

TXT : '"' ([a-zA-Z]|('0'..'9')|'_'|'.'|'!'|'@'|'#'|'$'|'%'|'^'|'&'|'*'|'('|')'|'['|']')* '"';

INT : ('0'..'9')+ ;
HEX :  '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ;
FLOAT: [0-9]+'.'[0-9]+;

//identifier
ID : [a-zA-Z] ([a-zA-Z]|('0'..'9')|'_'|'.')* ;

//white spaces
WS : [\t]+ | [\n]+;

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

IFO : '?';

EQUAL : '==';

GREQUAL : '>=';

LEEQUAL : '<=';

NOTEQUAL : '<>';

//comments
OLCOMMENT : '%%';

MLCOMMENT : '%%%';

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




