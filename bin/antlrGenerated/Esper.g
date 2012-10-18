grammar Esper;

options {
  language = Java;
  output = AST;
}

@lexer::header {
  package antlrGenerated;
}

@parser::header {
  package antlrGenerated;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
 
program : statements ;
statements : statement+ ;
statement : ifthenelse
          | condition
          | expr
          | assign 
          | declaration 
          ;
expr    : (PLUS | MINUS)^ term term | term ;
term    : (MULT | DIV)^ factor factor | factor ; // * 3 + 3 4
factor  : DIGIT | IDENTIFIER ;
operator : PLUS | MINUS | MULT | DIV ;
declaration : DECLARE^ IDENTIFIER VARTYPE ;
assign : ASSIGN^ IDENTIFIER expr ; //set a + 3 4
ifthenelse : if_ elseif* else_* ENDIF; // statement ENDIF ; //
if_ : IF^ condition statements ;
elseif : ELSEIF^ statements ;
else_ : ELSE^ statements ;
condition : (LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL)^ expr expr;
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ; //Whitespace, hidden from parser
DIGIT : '0'..'9' ;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
VARTYPE : 'int' ;
LESSTHAN : 'lt' ;
GREATERTHAN : 'gt' ;
LESSTHANEQUAL : 'lte' ;
GREATERTHANEQUAL : 'gte' ;
EQUALTO : 'eq' | 'equal' ;
DECLARE : 'd' | 'declr' | 'declare' ;
ASSIGN : 's' | 'set' ;
PRINT : 'p' | 'print' ;
IF : 'if' ;
ELSEIF : 'elseif' ;
ELSE : 'else' ;
ENDIF : 'endif' ;
IDENTIFIER : 'a'..'z' ('a'..'z' | DIGIT)*;

SEMICOLON: ';' ;