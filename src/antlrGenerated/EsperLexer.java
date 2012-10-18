// $ANTLR 3.4 C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g 2012-10-18 15:30:14

  package antlrGenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EsperLexer extends Lexer {
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:12: ( 'a' .. 'z' ( 'a' .. 'z' | DIGIT )* )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:14: 'a' .. 'z' ( 'a' .. 'z' | DIGIT )*
            {
            matchRange('a','z'); 

            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:34:23: ( 'a' .. 'z' | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:35:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:36:7: ( '0' .. '9' )
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:5: ( '+' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:37:7: '+'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:38:6: ( '-' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:38:8: '-'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:39:5: ( '*' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:39:7: '*'
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
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:40:4: ( '/' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:40:6: '/'
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

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:41:3: ( '=' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:41:5: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:42:10: ( ';' )
            // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:42:12: ';'
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
        // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:8: ( IDENTIFIER | WHITESPACE | DIGIT | PLUS | MINUS | MULT | DIV | EQ | SEMICOLON )
        int alt2=9;
        switch ( input.LA(1) ) {
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt2=1;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt2=2;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt2=3;
            }
            break;
        case '+':
            {
            alt2=4;
            }
            break;
        case '-':
            {
            alt2=5;
            }
            break;
        case '*':
            {
            alt2=6;
            }
            break;
        case '/':
            {
            alt2=7;
            }
            break;
        case '=':
            {
            alt2=8;
            }
            break;
        case ';':
            {
            alt2=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:10: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 2 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:21: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 3 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:32: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 4 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:38: PLUS
                {
                mPLUS(); 


                }
                break;
            case 5 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:43: MINUS
                {
                mMINUS(); 


                }
                break;
            case 6 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:49: MULT
                {
                mMULT(); 


                }
                break;
            case 7 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:54: DIV
                {
                mDIV(); 


                }
                break;
            case 8 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:58: EQ
                {
                mEQ(); 


                }
                break;
            case 9 :
                // C:\\Users\\Alex\\EclipseWorkspace\\esper-compiler\\src\\antlrGenerated\\Esper.g:1:61: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;

        }

    }


 

}