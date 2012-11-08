// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-11-08 17:38:06

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int CHARACTER=5;
    public static final int DECLARE=6;
    public static final int DECREASING=7;
    public static final int DIGITS=8;
    public static final int DIV=9;
    public static final int ELSE=10;
    public static final int ELSEIF=11;
    public static final int ENDFOR=12;
    public static final int ENDIF=13;
    public static final int ENDWHILE=14;
    public static final int EQUALTO=15;
    public static final int FOR=16;
    public static final int GREATERTHAN=17;
    public static final int GREATERTHANEQUAL=18;
    public static final int IDENTIFIER=19;
    public static final int IF=20;
    public static final int INCREASING=21;
    public static final int LESSTHAN=22;
    public static final int LESSTHANEQUAL=23;
    public static final int MINUS=24;
    public static final int MULT=25;
    public static final int PLUS=26;
    public static final int PRINT=27;
    public static final int SEMICOLON=28;
    public static final int STRING=29;
    public static final int VARINT=30;
    public static final int VARSTRING=31;
    public static final int WHILE=32;
    public static final int WHITESPACE=33;

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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:71:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:71:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:71:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            int _type = DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:8: ( ( '-' )* ( '0' .. '9' )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:10: ( '-' )* ( '0' .. '9' )+
            {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:10: ( '-' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:10: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:15: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:73:5: ( '+' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:73:7: '+'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:74:6: ( '-' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:74:8: '-'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:75:5: ( '*' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:75:7: '*'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:76:4: ( '/' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:76:6: '/'
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

    // $ANTLR start "VARINT"
    public final void mVARINT() throws RecognitionException {
        try {
            int _type = VARINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:77:7: ( 'int' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:77:9: 'int'
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
    // $ANTLR end "VARINT"

    // $ANTLR start "VARSTRING"
    public final void mVARSTRING() throws RecognitionException {
        try {
            int _type = VARSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:78:11: ( 'str' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:78:13: 'str'
            {
            match("str"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARSTRING"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:79:10: ( 'lt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:79:12: 'lt'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:80:13: ( 'gt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:80:15: 'gt'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:81:15: ( 'lte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:81:17: 'lte'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:82:18: ( 'gte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:82:20: 'gte'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:83:9: ( 'eq' | 'equal' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='e') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='q') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='u') ) {
                        alt4=2;
                    }
                    else {
                        alt4=1;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:83:11: 'eq'
                    {
                    match("eq"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:83:18: 'equal'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:84:9: ( 'declare' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:84:11: 'declare'
            {
            match("declare"); 



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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:85:8: ( 'set' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:85:10: 'set'
            {
            match("set"); 



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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:86:7: ( 'print' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:86:9: 'print'
            {
            match("print"); 



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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:87:4: ( 'if' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:87:6: 'if'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:88:8: ( 'elseif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:88:10: 'elseif'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:89:6: ( 'else' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:89:8: 'else'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:90:7: ( 'endif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:90:9: 'endif'
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

    // $ANTLR start "ENDFOR"
    public final void mENDFOR() throws RecognitionException {
        try {
            int _type = ENDFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:91:8: ( 'endfor' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:91:10: 'endfor'
            {
            match("endfor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFOR"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:92:5: ( 'for' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:92:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "DECREASING"
    public final void mDECREASING() throws RecognitionException {
        try {
            int _type = DECREASING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:12: ( 'dec' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:14: 'dec'
            {
            match("dec"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECREASING"

    // $ANTLR start "INCREASING"
    public final void mINCREASING() throws RecognitionException {
        try {
            int _type = INCREASING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:12: ( 'inc' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:14: 'inc'
            {
            match("inc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCREASING"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:95:7: ( 'while' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:95:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:96:10: ( 'endwhile' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:96:12: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:97:12: ( 'a' .. 'z' ( 'a' .. 'z' | DIGITS )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:97:14: 'a' .. 'z' ( 'a' .. 'z' | DIGITS )*
            {
            matchRange('a','z'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:97:23: ( 'a' .. 'z' | DIGITS )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }
                else if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:97:24: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:97:35: DIGITS
            	    {
            	    mDIGITS(); 


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:8: ( '\"' ( CHARACTER | DIGITS )* '\"' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:10: '\"' ( CHARACTER | DIGITS )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:14: ( CHARACTER | DIGITS )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }
                else if ( (LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:15: CHARACTER
            	    {
            	    mCHARACTER(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:25: DIGITS
            	    {
            	    mDIGITS(); 


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:99:11: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "CHARACTER"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:102:11: ( ';' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:102:13: ';'
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
        // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:8: ( WHITESPACE | DIGITS | PLUS | MINUS | MULT | DIV | VARINT | VARSTRING | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | ENDFOR | FOR | DECREASING | INCREASING | WHILE | ENDWHILE | IDENTIFIER | STRING | CHARACTER | SEMICOLON )
        int alt7=30;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 2 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:21: DIGITS
                {
                mDIGITS(); 


                }
                break;
            case 3 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:28: PLUS
                {
                mPLUS(); 


                }
                break;
            case 4 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:33: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:39: MULT
                {
                mMULT(); 


                }
                break;
            case 6 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:44: DIV
                {
                mDIV(); 


                }
                break;
            case 7 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:48: VARINT
                {
                mVARINT(); 


                }
                break;
            case 8 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:55: VARSTRING
                {
                mVARSTRING(); 


                }
                break;
            case 9 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:65: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 10 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:74: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 11 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:86: LESSTHANEQUAL
                {
                mLESSTHANEQUAL(); 


                }
                break;
            case 12 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:100: GREATERTHANEQUAL
                {
                mGREATERTHANEQUAL(); 


                }
                break;
            case 13 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:117: EQUALTO
                {
                mEQUALTO(); 


                }
                break;
            case 14 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:125: DECLARE
                {
                mDECLARE(); 


                }
                break;
            case 15 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:133: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 16 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:140: PRINT
                {
                mPRINT(); 


                }
                break;
            case 17 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:146: IF
                {
                mIF(); 


                }
                break;
            case 18 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:149: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 19 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:156: ELSE
                {
                mELSE(); 


                }
                break;
            case 20 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:161: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 21 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:167: ENDFOR
                {
                mENDFOR(); 


                }
                break;
            case 22 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:174: FOR
                {
                mFOR(); 


                }
                break;
            case 23 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:178: DECREASING
                {
                mDECREASING(); 


                }
                break;
            case 24 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:189: INCREASING
                {
                mINCREASING(); 


                }
                break;
            case 25 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:200: WHILE
                {
                mWHILE(); 


                }
                break;
            case 26 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:206: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:215: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 28 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:226: STRING
                {
                mSTRING(); 


                }
                break;
            case 29 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:233: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 30 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:243: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\1\24\4\uffff\11\27\5\uffff\1\27\1\45\1\uffff\2\27\1\51"+
        "\1\53\1\55\6\27\1\64\1\65\1\uffff\1\66\1\67\1\70\1\uffff\1\71\1"+
        "\uffff\1\27\1\uffff\2\27\1\100\1\27\1\102\1\27\6\uffff\1\27\1\106"+
        "\4\27\1\uffff\1\27\1\uffff\1\27\1\55\1\27\1\uffff\1\116\3\27\1\122"+
        "\1\123\1\124\1\uffff\1\125\2\27\4\uffff\1\27\1\131\1\132\2\uffff";
    static final String DFA7_eofS =
        "\133\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\1\55\4\uffff\1\146\1\145\2\164\1\154\1\145\1\162\1"+
        "\157\1\150\5\uffff\1\143\1\55\1\uffff\1\162\1\164\3\55\1\163\1\144"+
        "\1\143\1\151\1\162\1\151\2\55\1\uffff\3\55\1\uffff\1\55\1\uffff"+
        "\1\141\1\uffff\1\145\1\146\1\55\1\156\1\55\1\154\6\uffff\1\154\1"+
        "\55\1\146\1\157\1\150\1\141\1\uffff\1\164\1\uffff\1\145\1\55\1\146"+
        "\1\uffff\1\55\1\162\1\151\1\162\3\55\1\uffff\1\55\1\154\1\145\4"+
        "\uffff\1\145\2\55\2\uffff";
    static final String DFA7_maxS =
        "\1\172\1\uffff\1\71\4\uffff\1\156\3\164\1\161\1\145\1\162\1\157"+
        "\1\150\5\uffff\1\164\1\172\1\uffff\1\162\1\164\3\172\1\163\1\144"+
        "\1\143\1\151\1\162\1\151\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff"+
        "\1\141\1\uffff\1\145\1\167\1\172\1\156\1\172\1\154\6\uffff\1\154"+
        "\1\172\1\146\1\157\1\150\1\141\1\uffff\1\164\1\uffff\1\145\1\172"+
        "\1\146\1\uffff\1\172\1\162\1\151\1\162\3\172\1\uffff\1\172\1\154"+
        "\1\145\4\uffff\1\145\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\5\1\6\11\uffff\1\33\1\34\1\35\1\36"+
        "\1\4\2\uffff\1\33\15\uffff\1\21\3\uffff\1\11\1\uffff\1\12\1\uffff"+
        "\1\15\6\uffff\1\7\1\30\1\10\1\17\1\13\1\14\6\uffff\1\27\1\uffff"+
        "\1\26\3\uffff\1\23\7\uffff\1\24\3\uffff\1\20\1\31\1\22\1\25\3\uffff"+
        "\1\16\1\32";
    static final String DFA7_specialS =
        "\133\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\1\uffff\1\21\7\uffff\1\5\1\4\1"+
            "\uffff\1\2\1\uffff\1\6\12\3\1\uffff\1\23\5\uffff\32\22\6\uffff"+
            "\3\20\1\14\1\13\1\16\1\12\1\20\1\7\2\20\1\11\3\20\1\15\2\20"+
            "\1\10\3\20\1\17\3\20",
            "",
            "\1\3\2\uffff\12\3",
            "",
            "",
            "",
            "",
            "\1\26\7\uffff\1\25",
            "\1\31\16\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\35\1\uffff\1\36\2\uffff\1\34",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\44\20\uffff\1\43",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            "\1\46",
            "\1\47",
            "\1\27\2\uffff\12\27\47\uffff\4\27\1\50\25\27",
            "\1\27\2\uffff\12\27\47\uffff\4\27\1\52\25\27",
            "\1\27\2\uffff\12\27\47\uffff\24\27\1\54\5\27",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\75\2\uffff\1\74\15\uffff\1\76",
            "\1\27\2\uffff\12\27\47\uffff\13\27\1\77\16\27",
            "\1\101",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\27\2\uffff\12\27\47\uffff\10\27\1\105\21\27",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "",
            "\1\114",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\115",
            "",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "\1\27\2\uffff\12\27\47\uffff\32\27",
            "",
            ""
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
            return "1:1: Tokens : ( WHITESPACE | DIGITS | PLUS | MINUS | MULT | DIV | VARINT | VARSTRING | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | ENDFOR | FOR | DECREASING | INCREASING | WHILE | ENDWHILE | IDENTIFIER | STRING | CHARACTER | SEMICOLON );";
        }
    }
 

}