// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-25 12:31:00

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CHARACTER", "DECLARE", "DIGITS", "DIV", "ELSE", "ELSEIF", "ENDFOR", "ENDIF", "ENDWHILE", "EQUALTO", "FOR", "FROM", "GREATERTHAN", "GREATERTHANEQUAL", "IDENTIFIER", "IF", "LESSTHAN", "LESSTHANEQUAL", "MINUS", "MULT", "PLUS", "PRINT", "SEMICOLON", "STRING", "TO", "VARINT", "VARSTRING", "WHILE", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int CHARACTER=5;
    public static final int DECLARE=6;
    public static final int DIGITS=7;
    public static final int DIV=8;
    public static final int ELSE=9;
    public static final int ELSEIF=10;
    public static final int ENDFOR=11;
    public static final int ENDIF=12;
    public static final int ENDWHILE=13;
    public static final int EQUALTO=14;
    public static final int FOR=15;
    public static final int FROM=16;
    public static final int GREATERTHAN=17;
    public static final int GREATERTHANEQUAL=18;
    public static final int IDENTIFIER=19;
    public static final int IF=20;
    public static final int LESSTHAN=21;
    public static final int LESSTHANEQUAL=22;
    public static final int MINUS=23;
    public static final int MULT=24;
    public static final int PLUS=25;
    public static final int PRINT=26;
    public static final int SEMICOLON=27;
    public static final int STRING=28;
    public static final int TO=29;
    public static final int VARINT=30;
    public static final int VARSTRING=31;
    public static final int WHILE=32;
    public static final int WHITESPACE=33;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EsperParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EsperParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return EsperParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:20:1: program : statements ;
    public final EsperParser.program_return program() throws RecognitionException {
        EsperParser.program_return retval = new EsperParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.statements_return statements1 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:20:9: ( statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:20:11: statements
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_statements_in_program55);
            statements1=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:1: statements : ( statement )+ ;
    public final EsperParser.statements_return statements() throws RecognitionException {
        EsperParser.statements_return retval = new EsperParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.statement_return statement2 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:12: ( ( statement )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:14: ( statement )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:14: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGN||(LA1_0 >= DECLARE && LA1_0 <= DIV)||(LA1_0 >= EQUALTO && LA1_0 <= FOR)||(LA1_0 >= GREATERTHAN && LA1_0 <= PRINT)||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements63);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:1: statement : ( ifthenelse | condition | expr | assign | declaration | print | forloop );
    public final EsperParser.statement_return statement() throws RecognitionException {
        EsperParser.statement_return retval = new EsperParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.ifthenelse_return ifthenelse3 =null;

        EsperParser.condition_return condition4 =null;

        EsperParser.expr_return expr5 =null;

        EsperParser.assign_return assign6 =null;

        EsperParser.declaration_return declaration7 =null;

        EsperParser.print_return print8 =null;

        EsperParser.forloop_return forloop9 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:11: ( ifthenelse | condition | expr | assign | declaration | print | forloop )
            int alt2=7;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt2=1;
                }
                break;
            case EQUALTO:
            case GREATERTHAN:
            case GREATERTHANEQUAL:
            case LESSTHAN:
            case LESSTHANEQUAL:
                {
                alt2=2;
                }
                break;
            case DIGITS:
            case DIV:
            case IDENTIFIER:
            case MINUS:
            case MULT:
            case PLUS:
            case STRING:
                {
                alt2=3;
                }
                break;
            case ASSIGN:
                {
                alt2=4;
                }
                break;
            case DECLARE:
                {
                alt2=5;
                }
                break;
            case PRINT:
                {
                alt2=6;
                }
                break;
            case FOR:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:13: ifthenelse
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifthenelse_in_statement72);
                    ifthenelse3=ifthenelse();

                    state._fsp--;

                    adaptor.addChild(root_0, ifthenelse3.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:13: condition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_condition_in_statement86);
                    condition4=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition4.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:13: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement100);
                    expr5=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr5.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:13: assign
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_statement114);
                    assign6=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign6.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:26:13: declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_statement129);
                    declaration7=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration7.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:27:13: print
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_print_in_statement144);
                    print8=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print8.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:13: forloop
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forloop_in_statement158);
                    forloop9=forloop();

                    state._fsp--;

                    adaptor.addChild(root_0, forloop9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:30:1: expr : ( ( PLUS | MINUS ) ^ expr expr | term | STRING );
    public final EsperParser.expr_return expr() throws RecognitionException {
        EsperParser.expr_return retval = new EsperParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;
        Token STRING14=null;
        EsperParser.expr_return expr11 =null;

        EsperParser.expr_return expr12 =null;

        EsperParser.term_return term13 =null;


        Object set10_tree=null;
        Object STRING14_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:30:9: ( ( PLUS | MINUS ) ^ expr expr | term | STRING )
            int alt3=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case PLUS:
                {
                alt3=1;
                }
                break;
            case DIGITS:
            case DIV:
            case IDENTIFIER:
            case MULT:
                {
                alt3=2;
                }
                break;
            case STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:30:11: ( PLUS | MINUS ) ^ expr expr
                    {
                    root_0 = (Object)adaptor.nil();


                    set10=(Token)input.LT(1);

                    set10=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set10)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expr_in_expr186);
                    expr11=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr11.getTree());

                    pushFollow(FOLLOW_expr_in_expr188);
                    expr12=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr12.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:31:11: term
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_term_in_expr201);
                    term13=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term13.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:32:11: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_expr214); 
                    STRING14_tree = 
                    (Object)adaptor.create(STRING14)
                    ;
                    adaptor.addChild(root_0, STRING14_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:1: term : ( ( MULT | DIV ) ^ expr expr | factor );
    public final EsperParser.term_return term() throws RecognitionException {
        EsperParser.term_return retval = new EsperParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set15=null;
        EsperParser.expr_return expr16 =null;

        EsperParser.expr_return expr17 =null;

        EsperParser.factor_return factor18 =null;


        Object set15_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:9: ( ( MULT | DIV ) ^ expr expr | factor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DIV||LA4_0==MULT) ) {
                alt4=1;
            }
            else if ( (LA4_0==DIGITS||LA4_0==IDENTIFIER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:11: ( MULT | DIV ) ^ expr expr
                    {
                    root_0 = (Object)adaptor.nil();


                    set15=(Token)input.LT(1);

                    set15=(Token)input.LT(1);

                    if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set15)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expr_in_term258);
                    expr16=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr16.getTree());

                    pushFollow(FOLLOW_expr_in_term260);
                    expr17=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr17.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:11: factor
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term273);
                    factor18=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:41:1: factor : ( DIGITS | IDENTIFIER );
    public final EsperParser.factor_return factor() throws RecognitionException {
        EsperParser.factor_return retval = new EsperParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:41:9: ( DIGITS | IDENTIFIER )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set19=(Token)input.LT(1);

            if ( input.LA(1)==DIGITS||input.LA(1)==IDENTIFIER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set19)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:43:1: declaration : DECLARE ^ IDENTIFIER vartype ;
    public final EsperParser.declaration_return declaration() throws RecognitionException {
        EsperParser.declaration_return retval = new EsperParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DECLARE20=null;
        Token IDENTIFIER21=null;
        EsperParser.vartype_return vartype22 =null;


        Object DECLARE20_tree=null;
        Object IDENTIFIER21_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:43:13: ( DECLARE ^ IDENTIFIER vartype )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:43:15: DECLARE ^ IDENTIFIER vartype
            {
            root_0 = (Object)adaptor.nil();


            DECLARE20=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declaration329); 
            DECLARE20_tree = 
            (Object)adaptor.create(DECLARE20)
            ;
            root_0 = (Object)adaptor.becomeRoot(DECLARE20_tree, root_0);


            IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration332); 
            IDENTIFIER21_tree = 
            (Object)adaptor.create(IDENTIFIER21)
            ;
            adaptor.addChild(root_0, IDENTIFIER21_tree);


            pushFollow(FOLLOW_vartype_in_declaration334);
            vartype22=vartype();

            state._fsp--;

            adaptor.addChild(root_0, vartype22.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:1: assign : ASSIGN ^ IDENTIFIER expr ;
    public final EsperParser.assign_return assign() throws RecognitionException {
        EsperParser.assign_return retval = new EsperParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN23=null;
        Token IDENTIFIER24=null;
        EsperParser.expr_return expr25 =null;


        Object ASSIGN23_tree=null;
        Object IDENTIFIER24_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:8: ( ASSIGN ^ IDENTIFIER expr )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:10: ASSIGN ^ IDENTIFIER expr
            {
            root_0 = (Object)adaptor.nil();


            ASSIGN23=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign342); 
            ASSIGN23_tree = 
            (Object)adaptor.create(ASSIGN23)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGN23_tree, root_0);


            IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign345); 
            IDENTIFIER24_tree = 
            (Object)adaptor.create(IDENTIFIER24)
            ;
            adaptor.addChild(root_0, IDENTIFIER24_tree);


            pushFollow(FOLLOW_expr_in_assign347);
            expr25=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr25.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ifthenelse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifthenelse"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:1: ifthenelse : if_ ( elseif )* ( else_ )* ENDIF ;
    public final EsperParser.ifthenelse_return ifthenelse() throws RecognitionException {
        EsperParser.ifthenelse_return retval = new EsperParser.ifthenelse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENDIF29=null;
        EsperParser.if__return if_26 =null;

        EsperParser.elseif_return elseif27 =null;

        EsperParser.else__return else_28 =null;


        Object ENDIF29_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:12: ( if_ ( elseif )* ( else_ )* ENDIF )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:14: if_ ( elseif )* ( else_ )* ENDIF
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if__in_ifthenelse356);
            if_26=if_();

            state._fsp--;

            adaptor.addChild(root_0, if_26.getTree());

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:18: ( elseif )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ELSEIF) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:18: elseif
            	    {
            	    pushFollow(FOLLOW_elseif_in_ifthenelse358);
            	    elseif27=elseif();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif27.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:26: ( else_ )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ELSE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:26: else_
            	    {
            	    pushFollow(FOLLOW_else__in_ifthenelse361);
            	    else_28=else_();

            	    state._fsp--;

            	    adaptor.addChild(root_0, else_28.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            ENDIF29=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifthenelse364); 
            ENDIF29_tree = 
            (Object)adaptor.create(ENDIF29)
            ;
            adaptor.addChild(root_0, ENDIF29_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifthenelse"


    public static class if__return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:46:1: if_ : IF ^ condition statements ;
    public final EsperParser.if__return if_() throws RecognitionException {
        EsperParser.if__return retval = new EsperParser.if__return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF30=null;
        EsperParser.condition_return condition31 =null;

        EsperParser.statements_return statements32 =null;


        Object IF30_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:46:5: ( IF ^ condition statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:46:7: IF ^ condition statements
            {
            root_0 = (Object)adaptor.nil();


            IF30=(Token)match(input,IF,FOLLOW_IF_in_if_372); 
            IF30_tree = 
            (Object)adaptor.create(IF30)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF30_tree, root_0);


            pushFollow(FOLLOW_condition_in_if_375);
            condition31=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition31.getTree());

            pushFollow(FOLLOW_statements_in_if_377);
            statements32=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements32.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_"


    public static class elseif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:47:1: elseif : ELSEIF ^ statements ;
    public final EsperParser.elseif_return elseif() throws RecognitionException {
        EsperParser.elseif_return retval = new EsperParser.elseif_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSEIF33=null;
        EsperParser.statements_return statements34 =null;


        Object ELSEIF33_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:47:8: ( ELSEIF ^ statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:47:10: ELSEIF ^ statements
            {
            root_0 = (Object)adaptor.nil();


            ELSEIF33=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif385); 
            ELSEIF33_tree = 
            (Object)adaptor.create(ELSEIF33)
            ;
            root_0 = (Object)adaptor.becomeRoot(ELSEIF33_tree, root_0);


            pushFollow(FOLLOW_statements_in_elseif388);
            statements34=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements34.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif"


    public static class else__return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:48:1: else_ : ELSE ^ statements ;
    public final EsperParser.else__return else_() throws RecognitionException {
        EsperParser.else__return retval = new EsperParser.else__return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE35=null;
        EsperParser.statements_return statements36 =null;


        Object ELSE35_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:48:7: ( ELSE ^ statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:48:9: ELSE ^ statements
            {
            root_0 = (Object)adaptor.nil();


            ELSE35=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_396); 
            ELSE35_tree = 
            (Object)adaptor.create(ELSE35)
            ;
            root_0 = (Object)adaptor.becomeRoot(ELSE35_tree, root_0);


            pushFollow(FOLLOW_statements_in_else_399);
            statements36=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements36.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:49:1: condition : conditionaloperator ^ expr expr ;
    public final EsperParser.condition_return condition() throws RecognitionException {
        EsperParser.condition_return retval = new EsperParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.conditionaloperator_return conditionaloperator37 =null;

        EsperParser.expr_return expr38 =null;

        EsperParser.expr_return expr39 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:49:11: ( conditionaloperator ^ expr expr )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:49:13: conditionaloperator ^ expr expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionaloperator_in_condition407);
            conditionaloperator37=conditionaloperator();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(conditionaloperator37.getTree(), root_0);

            pushFollow(FOLLOW_expr_in_condition410);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            pushFollow(FOLLOW_expr_in_condition412);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class conditionaloperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionaloperator"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:50:1: conditionaloperator : ( LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL );
    public final EsperParser.conditionaloperator_return conditionaloperator() throws RecognitionException {
        EsperParser.conditionaloperator_return retval = new EsperParser.conditionaloperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set40=null;

        Object set40_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:50:21: ( LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set40=(Token)input.LT(1);

            if ( input.LA(1)==EQUALTO||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANEQUAL)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set40)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionaloperator"


    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:1: print : PRINT ^ expr ;
    public final EsperParser.print_return print() throws RecognitionException {
        EsperParser.print_return retval = new EsperParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT41=null;
        EsperParser.expr_return expr42 =null;


        Object PRINT41_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:7: ( PRINT ^ expr )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:9: PRINT ^ expr
            {
            root_0 = (Object)adaptor.nil();


            PRINT41=(Token)match(input,PRINT,FOLLOW_PRINT_in_print548); 
            PRINT41_tree = 
            (Object)adaptor.create(PRINT41)
            ;
            root_0 = (Object)adaptor.becomeRoot(PRINT41_tree, root_0);


            pushFollow(FOLLOW_expr_in_print551);
            expr42=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr42.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class vartype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vartype"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:57:1: vartype : ( VARINT | VARSTRING );
    public final EsperParser.vartype_return vartype() throws RecognitionException {
        EsperParser.vartype_return retval = new EsperParser.vartype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:57:9: ( VARINT | VARSTRING )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set43=(Token)input.LT(1);

            if ( (input.LA(1) >= VARINT && input.LA(1) <= VARSTRING) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set43)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vartype"


    public static class forloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forloop"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:60:1: forloop : FOR ( TO | FROM ) factor factor statements ENDFOR ;
    public final EsperParser.forloop_return forloop() throws RecognitionException {
        EsperParser.forloop_return retval = new EsperParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOR44=null;
        Token set45=null;
        Token ENDFOR49=null;
        EsperParser.factor_return factor46 =null;

        EsperParser.factor_return factor47 =null;

        EsperParser.statements_return statements48 =null;


        Object FOR44_tree=null;
        Object set45_tree=null;
        Object ENDFOR49_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:60:9: ( FOR ( TO | FROM ) factor factor statements ENDFOR )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:60:11: FOR ( TO | FROM ) factor factor statements ENDFOR
            {
            root_0 = (Object)adaptor.nil();


            FOR44=(Token)match(input,FOR,FOLLOW_FOR_in_forloop587); 
            FOR44_tree = 
            (Object)adaptor.create(FOR44)
            ;
            adaptor.addChild(root_0, FOR44_tree);


            set45=(Token)input.LT(1);

            if ( input.LA(1)==FROM||input.LA(1)==TO ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set45)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_factor_in_forloop597);
            factor46=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor46.getTree());

            pushFollow(FOLLOW_factor_in_forloop599);
            factor47=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor47.getTree());

            pushFollow(FOLLOW_statements_in_forloop601);
            statements48=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements48.getTree());

            ENDFOR49=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_forloop603); 
            ENDFOR49_tree = 
            (Object)adaptor.create(ENDFOR49)
            ;
            adaptor.addChild(root_0, ENDFOR49_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forloop"


    public static class whileloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileloop"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:61:1: whileloop : WHILE condition statements ENDWHILE ;
    public final EsperParser.whileloop_return whileloop() throws RecognitionException {
        EsperParser.whileloop_return retval = new EsperParser.whileloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE50=null;
        Token ENDWHILE53=null;
        EsperParser.condition_return condition51 =null;

        EsperParser.statements_return statements52 =null;


        Object WHILE50_tree=null;
        Object ENDWHILE53_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:61:11: ( WHILE condition statements ENDWHILE )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:61:13: WHILE condition statements ENDWHILE
            {
            root_0 = (Object)adaptor.nil();


            WHILE50=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileloop611); 
            WHILE50_tree = 
            (Object)adaptor.create(WHILE50)
            ;
            adaptor.addChild(root_0, WHILE50_tree);


            pushFollow(FOLLOW_condition_in_whileloop613);
            condition51=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition51.getTree());

            pushFollow(FOLLOW_statements_in_whileloop615);
            statements52=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements52.getTree());

            ENDWHILE53=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_whileloop617); 
            ENDWHILE53_tree = 
            (Object)adaptor.create(ENDWHILE53)
            ;
            adaptor.addChild(root_0, ENDWHILE53_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileloop"

    // Delegated rules


 

    public static final BitSet FOLLOW_statements_in_program55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements63 = new BitSet(new long[]{0x0000000017FEC1D2L});
    public static final BitSet FOLLOW_ifthenelse_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_statement86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statement144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forloop_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr179 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_expr186 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term251 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_term258 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_term260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_declaration329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration332 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_vartype_in_declaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign342 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assign345 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_assign347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_ifthenelse356 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_elseif_in_ifthenelse358 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_else__in_ifthenelse361 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_ENDIF_in_ifthenelse364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_372 = new BitSet(new long[]{0x0000000000664000L});
    public static final BitSet FOLLOW_condition_in_if_375 = new BitSet(new long[]{0x0000000017FEC1D0L});
    public static final BitSet FOLLOW_statements_in_if_377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif385 = new BitSet(new long[]{0x0000000017FEC1D0L});
    public static final BitSet FOLLOW_statements_in_elseif388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_396 = new BitSet(new long[]{0x0000000017FEC1D0L});
    public static final BitSet FOLLOW_statements_in_else_399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionaloperator_in_condition407 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_condition410 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_condition412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print548 = new BitSet(new long[]{0x0000000013880180L});
    public static final BitSet FOLLOW_expr_in_print551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forloop587 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_set_in_forloop589 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_factor_in_forloop597 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_factor_in_forloop599 = new BitSet(new long[]{0x0000000017FEC1D0L});
    public static final BitSet FOLLOW_statements_in_forloop601 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ENDFOR_in_forloop603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileloop611 = new BitSet(new long[]{0x0000000000664000L});
    public static final BitSet FOLLOW_condition_in_whileloop613 = new BitSet(new long[]{0x0000000017FEC1D0L});
    public static final BitSet FOLLOW_statements_in_whileloop615 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDWHILE_in_whileloop617 = new BitSet(new long[]{0x0000000000000002L});

}