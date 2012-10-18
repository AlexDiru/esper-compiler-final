// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-18 21:29:10

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public EsperLexer() {} 
    public EsperLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EsperLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g"; }

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:44:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:45:7: ( '0' .. '9' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:46:5: ( '+' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:46:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:47:6: ( '-' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:47:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:48:5: ( '*' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:48:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:49:4: ( '/' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:49:6: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "VARTYPE"
    public final void mVARTYPE() throws RecognitionException {
        try {
            int _type = VARTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:50:9: ( 'int' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:50:11: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARTYPE"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:51:10: ( 'lt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:51:12: 'lt'
            {
            match("lt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:52:13: ( 'gt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:52:15: 'gt'
            {
            match("gt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "LESSTHANEQUAL"
    public final void mLESSTHANEQUAL() throws RecognitionException {
        try {
            int _type = LESSTHANEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:53:15: ( 'lte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:53:17: 'lte'
            {
            match("lte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANEQUAL"

    // $ANTLR start "GREATERTHANEQUAL"
    public final void mGREATERTHANEQUAL() throws RecognitionException {
        try {
            int _type = GREATERTHANEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:54:18: ( 'gte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:54:20: 'gte'
            {
            match("gte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANEQUAL"

    // $ANTLR start "EQUALTO"
    public final void mEQUALTO() throws RecognitionException {
        try {
            int _type = EQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:55:9: ( 'eq' | 'equal' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='e') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='q') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='u') ) {
                        alt2=2;
                    }
                    else {
                        alt2=1;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:55:11: 'eq'
                    {
                    match("eq"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:55:18: 'equal'
                    {
                    match("equal"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALTO"

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:9: ( 'd' | 'declr' | 'declare' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='d') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='e') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='c') ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4=='l') ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5=='r') ) {
                                alt3=2;
                            }
                            else if ( (LA3_5=='a') ) {
                                alt3=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
                    alt3=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:11: 'd'
                    {
                    match('d'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:17: 'declr'
                    {
                    match("declr"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:56:27: 'declare'
                    {
                    match("declare"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:57:8: ( 's' | 'set' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='s') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='e') ) {
                    alt4=2;
                }
                else {
                    alt4=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:57:10: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:57:16: 'set'
                    {
                    match("set"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:58:7: ( 'p' | 'print' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='r') ) {
                    alt5=2;
                }
                else {
                    alt5=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:58:9: 'p'
                    {
                    match('p'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:58:15: 'print'
                    {
                    match("print"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:59:4: ( 'if' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:59:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:60:8: ( 'elseif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:60:10: 'elseif'
            {
            match("elseif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:61:6: ( 'else' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:61:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:62:7: ( 'endif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:62:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:63:12: ( 'a' .. 'z' ( 'a' .. 'z' | DIGIT )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:63:14: 'a' .. 'z' ( 'a' .. 'z' | DIGIT )*
            {
            matchRange('a','z'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:63:23: ( 'a' .. 'z' | DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:65:10: ( ';' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:65:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:8: ( WHITESPACE | DIGIT | PLUS | MINUS | MULT | DIV | VARTYPE | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | IDENTIFIER | SEMICOLON )
        int alt7=21;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 2 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:21: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 3 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:27: PLUS
                {
                mPLUS(); 


                }
                break;
            case 4 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:32: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:38: MULT
                {
                mMULT(); 


                }
                break;
            case 6 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:43: DIV
                {
                mDIV(); 


                }
                break;
            case 7 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:47: VARTYPE
                {
                mVARTYPE(); 


                }
                break;
            case 8 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:55: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 9 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:64: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 10 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:76: LESSTHANEQUAL
                {
                mLESSTHANEQUAL(); 


                }
                break;
            case 11 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:90: GREATERTHANEQUAL
                {
                mGREATERTHANEQUAL(); 


                }
                break;
            case 12 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:107: EQUALTO
                {
                mEQUALTO(); 


                }
                break;
            case 13 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:115: DECLARE
                {
                mDECLARE(); 


                }
                break;
            case 14 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:123: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 15 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:130: PRINT
                {
                mPRINT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:136: IF
                {
                mIF(); 


                }
                break;
            case 17 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:139: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 18 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:146: ELSE
                {
                mELSE(); 


                }
                break;
            case 19 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:151: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 20 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:157: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 21 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:168: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\7\uffff\4\16\1\30\1\32\1\34\2\uffff\1\16\1\36\1\40\1\42\1\44\3"+
        "\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\52\1\uffff\1\53\1\uffff"+
        "\1\54\1\uffff\1\16\1\uffff\3\16\1\32\1\16\3\uffff\1\16\1\64\3\16"+
        "\1\44\1\16\1\uffff\1\72\1\30\1\16\1\34\1\74\1\uffff\1\16\1\uffff"+
        "\1\30";
    static final String DFA7_eofS =
        "\76\uffff";
    static final String DFA7_minS =
        "\1\11\6\uffff\1\146\2\164\1\154\3\60\2\uffff\1\164\4\60\1\163\1"+
        "\144\1\143\1\uffff\1\164\1\uffff\1\151\1\uffff\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff\1\141\1\uffff\1\145\1\151\1\154\1\60\1\156"+
        "\3\uffff\1\154\1\60\1\146\1\141\1\164\1\60\1\146\1\uffff\2\60\1"+
        "\162\2\60\1\uffff\1\145\1\uffff\1\60";
    static final String DFA7_maxS =
        "\1\172\6\uffff\1\156\2\164\1\161\3\172\2\uffff\1\164\4\172\1\163"+
        "\1\144\1\143\1\uffff\1\164\1\uffff\1\151\1\uffff\1\172\1\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\1\141\1\uffff\1\145\1\151\1\154\1\172"+
        "\1\156\3\uffff\1\154\1\172\1\146\1\162\1\164\1\172\1\146\1\uffff"+
        "\2\172\1\162\2\172\1\uffff\1\145\1\uffff\1\172";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\7\uffff\1\24\1\25\10\uffff\1\15"+
        "\1\uffff\1\16\1\uffff\1\17\1\uffff\1\20\1\uffff\1\10\1\uffff\1\11"+
        "\1\uffff\1\14\5\uffff\1\7\1\12\1\13\7\uffff\1\22\5\uffff\1\23\1"+
        "\uffff\1\21\1\uffff";
    static final String DFA7_specialS =
        "\76\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\11\uffff\1\5\1\3\1\uffff\1\4\1"+
            "\uffff\1\6\12\2\1\uffff\1\17\45\uffff\3\16\1\13\1\12\1\16\1"+
            "\11\1\16\1\7\2\16\1\10\3\16\1\15\2\16\1\14\7\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\7\uffff\1\20",
            "\1\22",
            "\1\23",
            "\1\25\1\uffff\1\26\2\uffff\1\24",
            "\12\16\47\uffff\4\16\1\27\25\16",
            "\12\16\47\uffff\4\16\1\31\25\16",
            "\12\16\47\uffff\21\16\1\33\10\16",
            "",
            "",
            "\1\35",
            "\12\16\47\uffff\32\16",
            "\12\16\47\uffff\4\16\1\37\25\16",
            "\12\16\47\uffff\4\16\1\41\25\16",
            "\12\16\47\uffff\24\16\1\43\5\16",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "",
            "\1\51",
            "",
            "\12\16\47\uffff\32\16",
            "",
            "\12\16\47\uffff\32\16",
            "",
            "\12\16\47\uffff\32\16",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\16\47\uffff\32\16",
            "\1\61",
            "",
            "",
            "",
            "\1\62",
            "\12\16\47\uffff\10\16\1\63\21\16",
            "\1\65",
            "\1\67\20\uffff\1\66",
            "\1\70",
            "\12\16\47\uffff\32\16",
            "\1\71",
            "",
            "\12\16\47\uffff\32\16",
            "\12\16\47\uffff\32\16",
            "\1\73",
            "\12\16\47\uffff\32\16",
            "\12\16\47\uffff\32\16",
            "",
            "\1\75",
            "",
            "\12\16\47\uffff\32\16"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WHITESPACE | DIGIT | PLUS | MINUS | MULT | DIV | VARTYPE | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | IDENTIFIER | SEMICOLON );";
        }
    }
 

}