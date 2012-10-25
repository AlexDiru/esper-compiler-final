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
          | print
          | forloop
          ;
expr    : (PLUS|MINUS)^ expr expr 
        | term 
        | STRING
        ;
        // + 3 2
        // - 3 + 5 * 3 1
term    : (MULT|DIV)^ expr expr 
        | factor 
        ;
        // * 3 1
        // * 3 - 2 / 1 9
factor  : DIGITS
        | IDENTIFIER ;
declaration : DECLARE^ IDENTIFIER vartype ;
assign : ASSIGN^ IDENTIFIER expr ; //set a + 3 4
ifthenelse : if_ elseif* else_* ENDIF; // statement ENDIF ; //
if_ : IF^ condition statements ;
elseif : ELSEIF^ statements ;
else_ : ELSE^ statements ;
condition : conditionaloperator^ expr expr;
conditionaloperator : LESSTHAN 
                    | EQUALTO 
                    | GREATERTHAN 
                    | LESSTHANEQUAL 
                    | GREATERTHANEQUAL 
                    ;
print : PRINT^ expr ;
vartype : VARINT
        | VARSTRING
        ;
forloop : FOR (TO | FROM) factor factor statements ENDFOR ;
whileloop : WHILE condition statements ENDWHILE;
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ; //Whitespace, hidden from parser
DIGITS : '0'..'9'+ ;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
VARINT: 'int' ;
VARSTRING : 'str' ;
LESSTHAN : 'lt' ;
GREATERTHAN : 'gt' ;
LESSTHANEQUAL : 'lte' ;
GREATERTHANEQUAL : 'gte' ;
EQUALTO : 'eq' | 'equal' ; 
DECLARE : 'declare' ;
ASSIGN : 'set' ;
PRINT : 'print' ;
IF : 'if' ;
ELSEIF : 'elseif' ;
ELSE : 'else' ;
ENDIF : 'endif' ;
ENDFOR : 'endfor' ;
FOR : 'for' ;
TO : 'to' ;
FROM : 'from' ;
WHILE : 'while';
ENDWHILE : 'endwhile' ;
IDENTIFIER : 'a'..'z' ('a'..'z' | DIGITS)*;
STRING : '"' (CHARACTER|DIGITS)* '"' ;
CHARACTER : 'a'..'z'
          | 'A'..'Z'
          ;
SEMICOLON : ';' ;