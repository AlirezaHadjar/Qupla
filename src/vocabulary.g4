grammar vocabulary;

tokens { INDENT, DEDENT }

//lexer part
//data types in case sensitive
REAL : [rR][eE][aA][lL] ;

BOOL : [bB][oO][oO][lL] ;

STRING : [sS][tT][rR][iI][nN][gG] ;

SEPARATOR: ';';

TXT : '"' ~[\n]*? '"';

REAL_INT : ('0'..'9')+ ;
REAL_HEX :  '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ;
// float number with  optional number before and after dot
REAL_FLOAT : (('0'..'9')* '.' ('0'..'9')+) | (('0'..'9')+ '.' ('0'..'9')*) ;

// one line comments
ONCOMMENT: '%%' ~[\r\n]* -> skip;

// multi line comments
MLCOMMENT: '%%%' .*? '%%%' -> skip;

//white spaces
WS : [ \r\n\t]+ -> skip;

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

NEWLINE: '\r'? '\n';

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

comment: ONCOMMENT | MLCOMMENT {System.out.println("comment");};

 stat:
  createModule
 | variableDeclarator
 | comment
 | OTHER {System.err.println("unknown char: " + $OTHER.text);};

 inBlock:
    ifCondition | whileLoop | variableDeclarator | callModule | assign | read | write;

end : stat EOF ;

ifThenElse: boolExp COND_IF (IDENTIFIER) COLON (IDENTIFIER);

variableDeclarator
    : IDENTIFIER COLON (REAL | BOOL | STRING) SEPARATOR {System.out.println("variableDeclarator");};

callModule : IDENTIFIER PARENTHESIS_OPEN (IDENTIFIER | mathExp | boolExp | textExp | callModule) PARENTHESIS_CLOSE {System.out.println("Call Module");};

assign : IDENTIFIER ASSIGN (boolExp | textExp | mathExp) SEPARATOR;

boolExp: boolExp (logicalOp | compareOp) boolExp | NOT boolExp | PARENTHESIS_OPEN boolExp PARENTHESIS_CLOSE | TRUE | FALSE | IDENTIFIER | callModule | REAL_INT ;

textExp : TXT | textExp PLUS textExp | PARENTHESIS_OPEN textExp PARENTHESIS_CLOSE | callModule ;

mathOp: PLUS | MINUS | MULT | DIV | POW ;
logicalOp: AND | OR | XOR ;
compareOp: EQUAL | GREATER | LESS | GREQUAL | LEEQUAL | NOTEQUAL ;

mathExp : REAL_FLOAT | REAL_HEX | REAL_INT | ifThenElse | PARENTHESIS_OPEN mathExp PARENTHESIS_CLOSE | mathExp mathOp mathExp | callModule | IDENTIFIER {System.out.println("mathExp" + " " + $mathExp.text);};

read : READ IDENTIFIER SEPARATOR {System.out.println("Read");};

write : WRITE textExp SEPARATOR {System.out.println("Write");};

//not complete
ifCondition : IF (boolExp | textExp | mathExp) THEN codeBlock (ELSE codeBlock)? {System.out.println("IF statement");};

//not complete
whileLoop : WHILE (boolExp | textExp | mathExp)  codeBlock ;

simpleBlock: returnValue | assign | write | read | callModule | variableDeclarator;

codeBlock :
 (BEGIN (inBlock | returnValue | codeBlock)*? END )| simpleBlock {System.out.println("Code Block");};

moduleInput: (INPUT COLON (variableDeclarator)+)? {System.out.println("Module Input");};
moduleOutput: (OUTPUT COLON (REAL | BOOL | STRING) SEPARATOR)? {System.out.println("Module Output");};

createModule : MODULE IDENTIFIER
 moduleInput
 moduleOutput
 codeBlock
 {System.out.println("Create Module");};

returnValue : RETURN (mathExp | boolExp | textExp) SEPARATOR {System.out.println("Return a value");};
