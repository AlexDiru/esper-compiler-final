// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-18 15:30:13

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "DIV", "EQ", "IDENTIFIER", "MINUS", "MULT", "PLUS", "SEMICOLON", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int DIV=5;
    public static final int EQ=6;
    public static final int IDENTIFIER=7;
    public static final int MINUS=8;
    public static final int MULT=9;
    public static final int PLUS=10;
    public static final int SEMICOLON=11;
    public static final int WHITESPACE=12;

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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:1: statements : ( statement | statement statements -> ^( statement statements ) );
    public final EsperParser.statements_return statements() throws RecognitionException {
        EsperParser.statements_return retval = new EsperParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.statement_return statement2 =null;

        EsperParser.statement_return statement3 =null;

        EsperParser.statements_return statements4 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:12: ( statement | statement statements -> ^( statement statements ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:21:14: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_statements63);
                    statement2=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:14: statement statements
                    {
                    pushFollow(FOLLOW_statement_in_statements79);
                    statement3=statement();

                    state._fsp--;

                    stream_statement.add(statement3.getTree());

                    pushFollow(FOLLOW_statements_in_statements81);
                    statements4=statements();

                    state._fsp--;

                    stream_statements.add(statements4.getTree());

                    // AST REWRITE
                    // elements: statements, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:35: -> ^( statement statements )
                    {
                        // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:22:38: ^( statement statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_statement.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:1: statement : ( expr | assign ) ;
    public final EsperParser.statement_return statement() throws RecognitionException {
        EsperParser.statement_return retval = new EsperParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        EsperParser.expr_return expr5 =null;

        EsperParser.assign_return assign6 =null;



        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:11: ( ( expr | assign ) )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:13: ( expr | assign )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:13: ( expr | assign )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DIGIT) ) {
                alt2=1;
            }
            else if ( (LA2_0==IDENTIFIER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:14: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement97);
                    expr5=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr5.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:23:21: assign
                    {
                    pushFollow(FOLLOW_assign_in_statement101);
                    assign6=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign6.getTree());

                    }
                    break;

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
    // $ANTLR end "statement"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:1: expr : term ( ( PLUS | MINUS ) ^ term )* ;
    public final EsperParser.expr_return expr() throws RecognitionException {
        EsperParser.expr_return retval = new EsperParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set8=null;
        EsperParser.term_return term7 =null;

        EsperParser.term_return term9 =null;


        Object set8_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:9: ( term ( ( PLUS | MINUS ) ^ term )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:11: term ( ( PLUS | MINUS ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_expr113);
            term7=term();

            state._fsp--;

            adaptor.addChild(root_0, term7.getTree());

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:16: ( ( PLUS | MINUS ) ^ term )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==MINUS||LA3_0==PLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:24:18: ( PLUS | MINUS ) ^ term
            	    {
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


            	    pushFollow(FOLLOW_term_in_expr129);
            	    term9=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:1: term : factor ( ( MULT | DIV ) ^ factor )* ;
    public final EsperParser.term_return term() throws RecognitionException {
        EsperParser.term_return retval = new EsperParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set11=null;
        EsperParser.factor_return factor10 =null;

        EsperParser.factor_return factor12 =null;


        Object set11_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:9: ( factor ( ( MULT | DIV ) ^ factor )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:11: factor ( ( MULT | DIV ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term143);
            factor10=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor10.getTree());

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:18: ( ( MULT | DIV ) ^ factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DIV||LA4_0==MULT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:25:20: ( MULT | DIV ) ^ factor
            	    {
            	    set11=(Token)input.LT(1);

            	    set11=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set11)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term158);
            	    factor12=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:26:1: factor : DIGIT ;
    public final EsperParser.factor_return factor() throws RecognitionException {
        EsperParser.factor_return retval = new EsperParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT13=null;

        Object DIGIT13_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:26:9: ( DIGIT )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:26:11: DIGIT
            {
            root_0 = (Object)adaptor.nil();


            DIGIT13=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_factor170); 
            DIGIT13_tree = 
            (Object)adaptor.create(DIGIT13)
            ;
            adaptor.addChild(root_0, DIGIT13_tree);


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
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:27:1: operator : ( PLUS | MINUS | MULT | DIV );
    public final EsperParser.operator_return operator() throws RecognitionException {
        EsperParser.operator_return retval = new EsperParser.operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:27:10: ( PLUS | MINUS | MULT | DIV )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            root_0 = (Object)adaptor.nil();


            set14=(Token)input.LT(1);

            if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= PLUS) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set14)
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


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:1: assign : IDENTIFIER EQ expr -> ^( EQ IDENTIFIER expr ) ;
    public final EsperParser.assign_return assign() throws RecognitionException {
        EsperParser.assign_return retval = new EsperParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER15=null;
        Token EQ16=null;
        EsperParser.expr_return expr17 =null;


        Object IDENTIFIER15_tree=null;
        Object EQ16_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:8: ( IDENTIFIER EQ expr -> ^( EQ IDENTIFIER expr ) )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:10: IDENTIFIER EQ expr
            {
            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign198);  
            stream_IDENTIFIER.add(IDENTIFIER15);


            EQ16=(Token)match(input,EQ,FOLLOW_EQ_in_assign200);  
            stream_EQ.add(EQ16);


            pushFollow(FOLLOW_expr_in_assign202);
            expr17=expr();

            state._fsp--;

            stream_expr.add(expr17.getTree());

            // AST REWRITE
            // elements: expr, IDENTIFIER, EQ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:29: -> ^( EQ IDENTIFIER expr )
            {
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:28:32: ^( EQ IDENTIFIER expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\23\uffff";
    static final String DFA1_eofS =
        "\1\uffff\1\5\6\uffff\3\5\3\uffff\3\5\1\uffff\1\5";
    static final String DFA1_minS =
        "\2\4\1\6\2\4\2\uffff\14\4";
    static final String DFA1_maxS =
        "\1\7\1\12\1\6\2\4\2\uffff\1\4\3\12\3\4\3\12\1\4\1\12";
    static final String DFA1_acceptS =
        "\5\uffff\1\1\1\2\14\uffff";
    static final String DFA1_specialS =
        "\23\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\6\1\3\1\uffff\1\6\1\4\1\3\1\4",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\6\1\3\1\uffff\1\6\1\4\1\3\1\4",
            "\1\6\1\13\1\uffff\1\6\1\4\1\13\1\4",
            "\1\6\1\14\1\uffff\1\6\1\15\1\14\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\6\1\13\1\uffff\1\6\1\4\1\13\1\4",
            "\1\6\1\14\1\uffff\1\6\1\15\1\14\1\15",
            "\1\6\1\21\1\uffff\1\6\1\15\1\21\1\15",
            "\1\22",
            "\1\6\1\21\1\uffff\1\6\1\15\1\21\1\15"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "21:1: statements : ( statement | statement statements -> ^( statement statements ) );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_program55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements79 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_statements_in_statements81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr113 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_set_in_expr117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_expr129 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_factor_in_term143 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_set_in_term147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_factor_in_term158 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_DIGIT_in_factor170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assign198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_in_assign200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_assign202 = new BitSet(new long[]{0x0000000000000002L});

}