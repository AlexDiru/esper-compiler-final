grammar Esper;

options {
  language = Java;
  output = AST;
}

@lexer::header {
  package compiler;
}

@parser::header {
  package compiler;
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
          | whileloop
          ;
expr    : (PLUS|MINUS)^ expr expr 
        | term 
        | STRING
        ;
term    : (MULT|DIV)^ expr expr 
        | factor
        ;
factor  : DIGITS
        | IDENTIFIER 
        | NULLITY
        | INFINITY
        | NEGATIVEINFINITY
        ;
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
        | VARTRANSREAL
        ;
forloop : for_ ENDFOR ;
for_ : FOR^ forgap statements ; 
forgap : (INCREASING | DECREASING)^ factor factor;
whileloop : while_ ENDWHILE;
while_ : WHILE^ condition statements  ; 
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;
DIGITS : '-'* '0'..'9'+;
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
NULLITY : 'nullity' ;
INFINITY : 'inf' ;
NEGATIVEINFINITY : '-inf' ;
VARTRANSREAL: 'transreal' ;
VARINT: 'int' ;
VARSTRING : 'string' ;
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
DECREASING : 'dec' ;
INCREASING : 'inc' ;
WHILE : 'while';
ENDWHILE : 'endwhile' ;
IDENTIFIER : 'a'..'z' ('a'..'z' | DIGITS)*;
STRING : '"' (CHARACTER|DIGITS|' ')* '"' ;
CHARACTER : 'a'..'z'
          | 'A'..'Z'
          ;
SEMICOLON : ';' ;