// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-18 21:29:09

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "DECLARE", "DIGIT", "DIV", "ELSE", "ELSEIF", "ENDIF", "EQUALTO", "GREATERTHAN", "GREATERTHANEQUAL", "IDENTIFIER", "IF", "LESSTHAN", "LESSTHANEQUAL", "MINUS", "MULT", "PLUS", "PRINT", "SEMICOLON", "VARTYPE", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int DECLARE=5;
    public static final int DIGIT=6;
    public static final int DIV=7;
    public static final int ELSE=8;
    public static final int ELSEIF=9;
    public static final int ENDIF=10;
    public static final int EQUALTO=11;
    public static final int GREATERTHAN=12;
    public static final int GREATERTHANEQUAL=13;
    public static final int IDENTIFIER=14;
    public static final int IF=15;
    public static final int LESSTHAN=16;
    public static final int LESSTHANEQUAL=17;
    public static final int MINUS=18;
    public static final int MULT=19;
    public static final int PLUS=20;
    public static final int PRINT=21;
    public static final int SEMICOLON=22;
    public static final int VARTYPE=23;
    public static final int WHITESPACE=24;

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

                if ( ((LA1_0 >= ASSIGN && LA1_0 <= DIV)||(LA1_0 >= EQUALTO && LA1_0 <= PLUS)) ) {
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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:1: statement : ( ifthenelse | condition | expr | assign | declaration );
    public final EsperParser.statement_return statement() throws RecognitionException {
        EsperParser.statement_return retval = new EsperParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.ifthenelse_return ifthenelse3 =null;

        EsperParser.condition_return condition4 =null;

        EsperParser.expr_return expr5 =null;

        EsperParser.assign_return assign6 =null;

        EsperParser.declaration_return declaration7 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:11: ( ifthenelse | condition | expr | assign | declaration )
            int alt2=5;
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
            case DIGIT:
            case DIV:
            case IDENTIFIER:
            case MINUS:
            case MULT:
            case PLUS:
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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:1: expr : ( ( PLUS | MINUS ) ^ term term | term );
    public final EsperParser.expr_return expr() throws RecognitionException {
        EsperParser.expr_return retval = new EsperParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set8=null;
        EsperParser.term_return term9 =null;

        EsperParser.term_return term10 =null;

        EsperParser.term_return term11 =null;


        Object set8_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:9: ( ( PLUS | MINUS ) ^ term term | term )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MINUS||LA3_0==PLUS) ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= DIGIT && LA3_0 <= DIV)||LA3_0==IDENTIFIER||LA3_0==MULT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:11: ( PLUS | MINUS ) ^ term term
                    {
                    root_0 = (Object)adaptor.nil();


                    set8=(Token)input.LT(1);

                    set8=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set8)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_term_in_expr160);
                    term9=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term9.getTree());

                    pushFollow(FOLLOW_term_in_expr162);
                    term10=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:39: term
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_term_in_expr166);
                    term11=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term11.getTree());

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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:29:1: term : ( ( MULT | DIV ) ^ factor factor | factor );
    public final EsperParser.term_return term() throws RecognitionException {
        EsperParser.term_return retval = new EsperParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set12=null;
        EsperParser.factor_return factor13 =null;

        EsperParser.factor_return factor14 =null;

        EsperParser.factor_return factor15 =null;


        Object set12_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:29:9: ( ( MULT | DIV ) ^ factor factor | factor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DIV||LA4_0==MULT) ) {
                alt4=1;
            }
            else if ( (LA4_0==DIGIT||LA4_0==IDENTIFIER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:29:11: ( MULT | DIV ) ^ factor factor
                    {
                    root_0 = (Object)adaptor.nil();


                    set12=(Token)input.LT(1);

                    set12=(Token)input.LT(1);

                    if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set12)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_factor_in_term186);
                    factor13=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor13.getTree());

                    pushFollow(FOLLOW_factor_in_term188);
                    factor14=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:29:41: factor
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term192);
                    factor15=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor15.getTree());

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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:30:1: factor : ( DIGIT | IDENTIFIER );
    public final EsperParser.factor_return factor() throws RecognitionException {
        EsperParser.factor_return retval = new EsperParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:30:9: ( DIGIT | IDENTIFIER )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set16=(Token)input.LT(1);

            if ( input.LA(1)==DIGIT||input.LA(1)==IDENTIFIER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set16)
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


    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:31:1: operator : ( PLUS | MINUS | MULT | DIV );
    public final EsperParser.operator_return operator() throws RecognitionException {
        EsperParser.operator_return retval = new EsperParser.operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:31:10: ( PLUS | MINUS | MULT | DIV )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set17=(Token)input.LT(1);

            if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= PLUS) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set17)
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
    // $ANTLR end "operator"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:32:1: declaration : DECLARE ^ IDENTIFIER VARTYPE ;
    public final EsperParser.declaration_return declaration() throws RecognitionException {
        EsperParser.declaration_return retval = new EsperParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DECLARE18=null;
        Token IDENTIFIER19=null;
        Token VARTYPE20=null;

        Object DECLARE18_tree=null;
        Object IDENTIFIER19_tree=null;
        Object VARTYPE20_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:32:13: ( DECLARE ^ IDENTIFIER VARTYPE )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:32:15: DECLARE ^ IDENTIFIER VARTYPE
            {
            root_0 = (Object)adaptor.nil();


            DECLARE18=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declaration234); 
            DECLARE18_tree = 
            (Object)adaptor.create(DECLARE18)
            ;
            root_0 = (Object)adaptor.becomeRoot(DECLARE18_tree, root_0);


            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration237); 
            IDENTIFIER19_tree = 
            (Object)adaptor.create(IDENTIFIER19)
            ;
            adaptor.addChild(root_0, IDENTIFIER19_tree);


            VARTYPE20=(Token)match(input,VARTYPE,FOLLOW_VARTYPE_in_declaration239); 
            VARTYPE20_tree = 
            (Object)adaptor.create(VARTYPE20)
            ;
            adaptor.addChild(root_0, VARTYPE20_tree);


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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:33:1: assign : ASSIGN ^ IDENTIFIER expr ;
    public final EsperParser.assign_return assign() throws RecognitionException {
        EsperParser.assign_return retval = new EsperParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN21=null;
        Token IDENTIFIER22=null;
        EsperParser.expr_return expr23 =null;


        Object ASSIGN21_tree=null;
        Object IDENTIFIER22_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:33:8: ( ASSIGN ^ IDENTIFIER expr )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:33:10: ASSIGN ^ IDENTIFIER expr
            {
            root_0 = (Object)adaptor.nil();


            ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign247); 
            ASSIGN21_tree = 
            (Object)adaptor.create(ASSIGN21)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGN21_tree, root_0);


            IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign250); 
            IDENTIFIER22_tree = 
            (Object)adaptor.create(IDENTIFIER22)
            ;
            adaptor.addChild(root_0, IDENTIFIER22_tree);


            pushFollow(FOLLOW_expr_in_assign252);
            expr23=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr23.getTree());

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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:1: ifthenelse : if_ ( elseif )* ( else_ )* ENDIF ;
    public final EsperParser.ifthenelse_return ifthenelse() throws RecognitionException {
        EsperParser.ifthenelse_return retval = new EsperParser.ifthenelse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENDIF27=null;
        EsperParser.if__return if_24 =null;

        EsperParser.elseif_return elseif25 =null;

        EsperParser.else__return else_26 =null;


        Object ENDIF27_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:12: ( if_ ( elseif )* ( else_ )* ENDIF )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:14: if_ ( elseif )* ( else_ )* ENDIF
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if__in_ifthenelse261);
            if_24=if_();

            state._fsp--;

            adaptor.addChild(root_0, if_24.getTree());

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:18: ( elseif )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ELSEIF) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:18: elseif
            	    {
            	    pushFollow(FOLLOW_elseif_in_ifthenelse263);
            	    elseif25=elseif();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif25.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:26: ( else_ )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ELSE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:26: else_
            	    {
            	    pushFollow(FOLLOW_else__in_ifthenelse266);
            	    else_26=else_();

            	    state._fsp--;

            	    adaptor.addChild(root_0, else_26.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            ENDIF27=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifthenelse269); 
            ENDIF27_tree = 
            (Object)adaptor.create(ENDIF27)
            ;
            adaptor.addChild(root_0, ENDIF27_tree);


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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:35:1: if_ : IF ^ condition statements ;
    public final EsperParser.if__return if_() throws RecognitionException {
        EsperParser.if__return retval = new EsperParser.if__return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF28=null;
        EsperParser.condition_return condition29 =null;

        EsperParser.statements_return statements30 =null;


        Object IF28_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:35:5: ( IF ^ condition statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:35:7: IF ^ condition statements
            {
            root_0 = (Object)adaptor.nil();


            IF28=(Token)match(input,IF,FOLLOW_IF_in_if_277); 
            IF28_tree = 
            (Object)adaptor.create(IF28)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF28_tree, root_0);


            pushFollow(FOLLOW_condition_in_if_280);
            condition29=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition29.getTree());

            pushFollow(FOLLOW_statements_in_if_282);
            statements30=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements30.getTree());

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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:1: elseif : ELSEIF ^ statements ;
    public final EsperParser.elseif_return elseif() throws RecognitionException {
        EsperParser.elseif_return retval = new EsperParser.elseif_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSEIF31=null;
        EsperParser.statements_return statements32 =null;


        Object ELSEIF31_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:8: ( ELSEIF ^ statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:10: ELSEIF ^ statements
            {
            root_0 = (Object)adaptor.nil();


            ELSEIF31=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif290); 
            ELSEIF31_tree = 
            (Object)adaptor.create(ELSEIF31)
            ;
            root_0 = (Object)adaptor.becomeRoot(ELSEIF31_tree, root_0);


            pushFollow(FOLLOW_statements_in_elseif293);
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
    // $ANTLR end "elseif"


    public static class else__return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:1: else_ : ELSE ^ statements ;
    public final EsperParser.else__return else_() throws RecognitionException {
        EsperParser.else__return retval = new EsperParser.else__return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE33=null;
        EsperParser.statements_return statements34 =null;


        Object ELSE33_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:7: ( ELSE ^ statements )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:9: ELSE ^ statements
            {
            root_0 = (Object)adaptor.nil();


            ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_301); 
            ELSE33_tree = 
            (Object)adaptor.create(ELSE33)
            ;
            root_0 = (Object)adaptor.becomeRoot(ELSE33_tree, root_0);


            pushFollow(FOLLOW_statements_in_else_304);
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
    // $ANTLR end "else_"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:38:1: condition : ( LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL ) ^ expr expr ;
    public final EsperParser.condition_return condition() throws RecognitionException {
        EsperParser.condition_return retval = new EsperParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set35=null;
        EsperParser.expr_return expr36 =null;

        EsperParser.expr_return expr37 =null;


        Object set35_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:38:11: ( ( LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL ) ^ expr expr )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:38:13: ( LESSTHAN | EQUALTO | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL ) ^ expr expr
            {
            root_0 = (Object)adaptor.nil();


            set35=(Token)input.LT(1);

            set35=(Token)input.LT(1);

            if ( (input.LA(1) >= EQUALTO && input.LA(1) <= GREATERTHANEQUAL)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANEQUAL) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set35)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_expr_in_condition333);
            expr36=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr36.getTree());

            pushFollow(FOLLOW_expr_in_condition335);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

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

    // Delegated rules


 

    public static final BitSet FOLLOW_statements_in_program55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements63 = new BitSet(new long[]{0x00000000001FF8F2L});
    public static final BitSet FOLLOW_ifthenelse_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_statement86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr151 = new BitSet(new long[]{0x00000000000840C0L});
    public static final BitSet FOLLOW_term_in_expr160 = new BitSet(new long[]{0x00000000000840C0L});
    public static final BitSet FOLLOW_term_in_expr162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term177 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_factor_in_term186 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_factor_in_term188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_declaration234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration237 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_VARTYPE_in_declaration239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assign250 = new BitSet(new long[]{0x00000000001C40C0L});
    public static final BitSet FOLLOW_expr_in_assign252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_ifthenelse261 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_elseif_in_ifthenelse263 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_else__in_ifthenelse266 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_ENDIF_in_ifthenelse269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_277 = new BitSet(new long[]{0x0000000000033800L});
    public static final BitSet FOLLOW_condition_in_if_280 = new BitSet(new long[]{0x00000000001FF8F0L});
    public static final BitSet FOLLOW_statements_in_if_282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif290 = new BitSet(new long[]{0x00000000001FF8F0L});
    public static final BitSet FOLLOW_statements_in_elseif293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_301 = new BitSet(new long[]{0x00000000001FF8F0L});
    public static final BitSet FOLLOW_statements_in_else_304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_condition312 = new BitSet(new long[]{0x00000000001C40C0L});
    public static final BitSet FOLLOW_expr_in_condition333 = new BitSet(new long[]{0x00000000001C40C0L});
    public static final BitSet FOLLOW_expr_in_condition335 = new BitSet(new long[]{0x0000000000000002L});

}