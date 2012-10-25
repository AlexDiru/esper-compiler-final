// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-25 12:31:01

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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:67:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:67:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:67:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:68:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:68:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:68:10: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:69:5: ( '+' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:69:7: '+'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:70:6: ( '-' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:70:8: '-'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:71:5: ( '*' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:71:7: '*'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:4: ( '/' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:72:6: '/'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:73:7: ( 'int' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:73:9: 'int'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:74:11: ( 'str' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:74:13: 'str'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:75:10: ( 'lt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:75:12: 'lt'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:76:13: ( 'gt' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:76:15: 'gt'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:77:15: ( 'lte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:77:17: 'lte'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:78:18: ( 'gte' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:78:20: 'gte'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:79:9: ( 'eq' | 'equal' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='q') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='u') ) {
                        alt3=2;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:79:11: 'eq'
                    {
                    match("eq"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:79:18: 'equal'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:80:9: ( 'declare' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:80:11: 'declare'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:81:8: ( 'set' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:81:10: 'set'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:82:7: ( 'print' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:82:9: 'print'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:83:4: ( 'if' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:83:6: 'if'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:84:8: ( 'elseif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:84:10: 'elseif'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:85:6: ( 'else' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:85:8: 'else'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:86:7: ( 'endif' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:86:9: 'endif'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:87:8: ( 'endfor' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:87:10: 'endfor'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:88:5: ( 'for' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:88:7: 'for'
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

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:89:4: ( 'to' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:89:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:90:6: ( 'from' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:90:8: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:91:7: ( 'while' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:91:9: 'while'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:92:10: ( 'endwhile' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:92:12: 'endwhile'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:12: ( 'a' .. 'z' ( 'a' .. 'z' | DIGITS )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:14: 'a' .. 'z' ( 'a' .. 'z' | DIGITS )*
            {
            matchRange('a','z'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:23: ( 'a' .. 'z' | DIGITS )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }
                else if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:24: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:93:35: DIGITS
            	    {
            	    mDIGITS(); 


            	    }
            	    break;

            	default :
            	    break loop4;
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:8: ( '\"' ( CHARACTER | DIGITS )* '\"' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:10: '\"' ( CHARACTER | DIGITS )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:14: ( CHARACTER | DIGITS )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }
                else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:15: CHARACTER
            	    {
            	    mCHARACTER(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:94:25: DIGITS
            	    {
            	    mDIGITS(); 


            	    }
            	    break;

            	default :
            	    break loop5;
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:95:11: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:11: ( ';' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:98:13: ';'
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
        // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:8: ( WHITESPACE | DIGITS | PLUS | MINUS | MULT | DIV | VARINT | VARSTRING | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | ENDFOR | FOR | TO | FROM | WHILE | ENDWHILE | IDENTIFIER | STRING | CHARACTER | SEMICOLON )
        int alt6=30;
        alt6 = dfa6.predict(input);
        switch (alt6) {
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
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:178: TO
                {
                mTO(); 


                }
                break;
            case 24 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:181: FROM
                {
                mFROM(); 


                }
                break;
            case 25 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:186: WHILE
                {
                mWHILE(); 


                }
                break;
            case 26 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:192: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:201: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 28 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:212: STRING
                {
                mSTRING(); 


                }
                break;
            case 29 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:219: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 30 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:229: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\7\uffff\12\27\4\uffff\1\27\1\46\1\uffff\2\27\1\52\1\54\1\56\6\27"+
        "\1\65\1\27\1\67\1\uffff\1\70\1\71\1\72\1\uffff\1\73\1\uffff\1\27"+
        "\1\uffff\4\27\1\103\1\27\1\uffff\1\27\5\uffff\1\27\1\110\5\27\1"+
        "\uffff\1\116\1\27\1\56\1\27\1\uffff\1\121\3\27\1\125\1\uffff\1\126"+
        "\1\127\1\uffff\1\130\2\27\4\uffff\1\27\1\134\1\135\2\uffff";
    static final String DFA6_eofS =
        "\136\uffff";
    static final String DFA6_minS =
        "\1\11\6\uffff\1\146\1\145\2\164\1\154\1\145\1\162\2\157\1\150\4"+
        "\uffff\1\164\1\60\1\uffff\1\162\1\164\3\60\1\163\1\144\1\143\1\151"+
        "\1\162\1\157\1\60\1\151\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1"+
        "\141\1\uffff\1\145\1\146\1\154\1\156\1\60\1\155\1\uffff\1\154\5"+
        "\uffff\1\154\1\60\1\146\1\157\1\150\1\141\1\164\1\uffff\1\60\1\145"+
        "\1\60\1\146\1\uffff\1\60\1\162\1\151\1\162\1\60\1\uffff\2\60\1\uffff"+
        "\1\60\1\154\1\145\4\uffff\1\145\2\60\2\uffff";
    static final String DFA6_maxS =
        "\1\172\6\uffff\1\156\3\164\1\161\1\145\2\162\1\157\1\150\4\uffff"+
        "\1\164\1\172\1\uffff\1\162\1\164\3\172\1\163\1\144\1\143\1\151\1"+
        "\162\1\157\1\172\1\151\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff"+
        "\1\141\1\uffff\1\145\1\167\1\154\1\156\1\172\1\155\1\uffff\1\154"+
        "\5\uffff\1\154\1\172\1\146\1\157\1\150\1\141\1\164\1\uffff\1\172"+
        "\1\145\1\172\1\146\1\uffff\1\172\1\162\1\151\1\162\1\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\154\1\145\4\uffff\1\145\2\172\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\12\uffff\1\33\1\34\1\35\1\36\2"+
        "\uffff\1\33\16\uffff\1\21\3\uffff\1\11\1\uffff\1\12\1\uffff\1\15"+
        "\6\uffff\1\27\1\uffff\1\7\1\10\1\17\1\13\1\14\7\uffff\1\26\4\uffff"+
        "\1\23\5\uffff\1\30\2\uffff\1\24\3\uffff\1\20\1\31\1\22\1\25\3\uffff"+
        "\1\16\1\32";
    static final String DFA6_specialS =
        "\136\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\1\uffff\1\22\7\uffff\1\5\1\3\1"+
            "\uffff\1\4\1\uffff\1\6\12\2\1\uffff\1\24\5\uffff\32\23\6\uffff"+
            "\3\21\1\14\1\13\1\16\1\12\1\21\1\7\2\21\1\11\3\21\1\15\2\21"+
            "\1\10\1\17\2\21\1\20\3\21",
            "",
            "",
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
            "\1\41\2\uffff\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\45",
            "\12\27\47\uffff\32\27",
            "",
            "\1\47",
            "\1\50",
            "\12\27\47\uffff\4\27\1\51\25\27",
            "\12\27\47\uffff\4\27\1\53\25\27",
            "\12\27\47\uffff\24\27\1\55\5\27",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\27\47\uffff\32\27",
            "\1\66",
            "\12\27\47\uffff\32\27",
            "",
            "\12\27\47\uffff\32\27",
            "\12\27\47\uffff\32\27",
            "\12\27\47\uffff\32\27",
            "",
            "\12\27\47\uffff\32\27",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\77\2\uffff\1\76\15\uffff\1\100",
            "\1\101",
            "\1\102",
            "\12\27\47\uffff\32\27",
            "\1\104",
            "",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\12\27\47\uffff\10\27\1\107\21\27",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\27\47\uffff\32\27",
            "\1\117",
            "\12\27\47\uffff\32\27",
            "\1\120",
            "",
            "\12\27\47\uffff\32\27",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\27\47\uffff\32\27",
            "",
            "\12\27\47\uffff\32\27",
            "\12\27\47\uffff\32\27",
            "",
            "\12\27\47\uffff\32\27",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "\1\133",
            "\12\27\47\uffff\32\27",
            "\12\27\47\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WHITESPACE | DIGITS | PLUS | MINUS | MULT | DIV | VARINT | VARSTRING | LESSTHAN | GREATERTHAN | LESSTHANEQUAL | GREATERTHANEQUAL | EQUALTO | DECLARE | ASSIGN | PRINT | IF | ELSEIF | ELSE | ENDIF | ENDFOR | FOR | TO | FROM | WHILE | ENDWHILE | IDENTIFIER | STRING | CHARACTER | SEMICOLON );";
        }
    }
 

}