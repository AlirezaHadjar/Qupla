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

COMMA : ',';

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

RETURN: [rR][eE][tT][uU][rR][nN] ;

//identifier
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

//error handling
OTHER : . ;

// parser part

comment: ONCOMMENT | MLCOMMENT;

//not completed yet: should textExp or mathExp or boolExp be here or not?
stat
 : assign
 | comment
 | ifCondition
 | mathExp
 | boolExp
 | variableDeclarator
 | whileLoop
 | write
 | read
 | callModule SEPARATOR
 | createModule
 | textExp
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

end : stat EOF ;

variableDeclarator
    : IDENTIFIER COLON (REAL | BOOL | STRING) SEPARATOR {System.out.println("variableDeclarator");};

assign : IDENTIFIER ASSIGN boolExp SEPARATOR | IDENTIFIER ASSIGN textExp SEPARATOR | IDENTIFIER ASSIGN mathExp SEPARATOR ;

boolExp: boolExp (logicalOp | compareOp) boolExp | boolExp (logicalOp | compareOp) mathExp | boolExp (logicalOp | compareOp) value | mathExp (logicalOp | compareOp) boolExp | mathExp (logicalOp | compareOp) mathExp | mathExp (logicalOp | compareOp) value | value (logicalOp | compareOp) boolExp | value (logicalOp | compareOp) mathExp | value (logicalOp | compareOp) value | NOT boolExp | PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE | TRUE | FALSE ;

textExp : TXT | textExp PLUS textExp ;

mathOp: PLUS | MINUS | MULT | DIV | POW ;
logicalOp: AND | OR | XOR ;
compareOp: EQUAL | GREATER | LESS | GREQUAL | LEEQUAL | NOTEQUAL ;

value: IDENTIFIER | callModule;

mathExp : REAL_FLOAT | REAL_HEX | REAL_INT | PARENTHESIS_OPEN mathExp PARENTHESIS_CLOSE | mathExp mathOp mathExp | value mathOp mathExp | mathExp mathOp value | value mathOp value ;

read : READ IDENTIFIER (boolExp | mathExp | textExp | callModule | IDENTIFIER) SEPARATOR;

write : WRITE (boolExp | mathExp | textExp | callModule | IDENTIFIER) SEPARATOR ;

//not complete
ifCondition : IF (boolExp | textExp | mathExp) THEN codeBlock (ELSE codeBlock)?;

//not complete
whileLoop : WHILE boolExp codeBlock ;

codeBlock : stat* {System.out.println("Code Block");};

moduleInput: (INPUT COLON (variableDeclarator)*)? {System.out.println("Module Input");};
moduleOutput: (OUTPUT COLON (REAL | BOOL | STRING) SEPARATOR)? {System.out.println("Module Output");};

createModule : MODULE IDENTIFIER
 moduleInput
 moduleOutput
 BEGIN
 codeBlock
 returnValue?
 END
 {System.out.println("Create Module");};

returnValue : RETURN (IDENTIFIER | mathExp | boolExp | textExp | callModule) SEPARATOR {System.out.println("Return a value");};

callModule : IDENTIFIER PARENTHESIS_OPEN (IDENTIFIER | mathExp | boolExp | textExp | callModule) PARENTHESIS_CLOSE {System.out.println("Call Module");};
