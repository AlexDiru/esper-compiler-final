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
statements : statement 
           | statement statements -> ^(statement statements);
statement : (expr | assign) ;
expr    : term ( ( PLUS | MINUS )^  term )* ;
term    : factor ( ( MULT | DIV )^ factor )* ;
factor  : DIGIT ;
operator : PLUS | MINUS | MULT | DIV ;
assign : IDENTIFIER EQ expr -> ^(EQ IDENTIFIER expr);
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

IDENTIFIER : 'a'..'z' ('a'..'z' | DIGIT)*;
WHITESPACE :  '\t' | ' ' | '\r' | '\n'| '\u000C' ;
DIGIT : '0'..'9' ;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
EQ: '=' ;
SEMICOLON: ';' ;