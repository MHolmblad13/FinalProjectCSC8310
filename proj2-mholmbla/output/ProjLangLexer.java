// $ANTLR 3.5.2 /Users/main/Documents/proj1-mholmbla/ProjLang.g 2019-12-11 13:20:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int CEQ=5;
	public static final int DIGIT=6;
	public static final int DIV=7;
	public static final int DO=8;
	public static final int ELSE=9;
	public static final int END=10;
	public static final int EP=11;
	public static final int EQ=12;
	public static final int FALSE=13;
	public static final int FUN=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int IN=17;
	public static final int LBRA=18;
	public static final int LET=19;
	public static final int LETTER=20;
	public static final int LPAR=21;
	public static final int LT=22;
	public static final int MINUS=23;
	public static final int NUM=24;
	public static final int OR=25;
	public static final int PLUS=26;
	public static final int RBRA=27;
	public static final int RPAR=28;
	public static final int SEMI=29;
	public static final int THEN=30;
	public static final int TIMES=31;
	public static final int TRUE=32;
	public static final int VAL=33;
	public static final int WHILE=34;
	public static final int WS=35;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/main/Documents/proj1-mholmbla/ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:4:16: ( '0' .. '9' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:6:4: ( 'if' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:6:6: 'if'
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

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:7:6: ( 'then' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:7:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:8:6: ( 'else' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:8:8: 'else'
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

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:9:5: ( 'let' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:9:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:10:5: ( 'val' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:10:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:11:5: ( 'fun' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:11:7: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:12:7: ( 'while' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:12:9: 'while'
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

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:13:4: ( 'do' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:13:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:14:6: ( 'true' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:14:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:15:7: ( 'false' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:15:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:16:5: ( 'end' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:16:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:17:4: ( 'in' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:17:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:18:4: ( LETTER ( LETTER | DIGIT )* )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:18:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:18:13: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:19:5: ( ( DIGIT )+ )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:19:7: ( DIGIT )+
			{
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:19:7: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:
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
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:24:4: ( '<' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:24:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:25:4: ( '=' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:25:6: '='
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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:26:6: ( '+' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:26:8: '+'
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
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:27:7: ( '-' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:27:9: '-'
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

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:28:7: ( '*' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:28:9: '*'
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
	// $ANTLR end "TIMES"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:29:5: ( '/' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:29:7: '/'
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

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:30:4: ( '|' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:30:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:31:5: ( '&' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:31:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "CEQ"
	public final void mCEQ() throws RecognitionException {
		try {
			int _type = CEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:33:5: ( ':=' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:33:7: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CEQ"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:34:6: ( ';' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:34:8: ';'
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
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:35:6: ( '(' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:35:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:36:6: ( ')' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:36:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "LBRA"
	public final void mLBRA() throws RecognitionException {
		try {
			int _type = LBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:37:6: ( '{' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:37:8: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRA"

	// $ANTLR start "RBRA"
	public final void mRBRA() throws RecognitionException {
		try {
			int _type = RBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:38:6: ( '}' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:38:8: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRA"

	// $ANTLR start "EP"
	public final void mEP() throws RecognitionException {
		try {
			int _type = EP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:39:4: ( '!' )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:39:6: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EP"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:41:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:41:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:41:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:8: ( IF | THEN | ELSE | LET | VAL | FUN | WHILE | DO | TRUE | FALSE | END | IN | ID | NUM | LT | EQ | PLUS | MINUS | TIMES | DIV | OR | AND | CEQ | SEMI | LPAR | RPAR | LBRA | RBRA | EP | WS )
		int alt4=30;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:13: THEN
				{
				mTHEN(); 

				}
				break;
			case 3 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:18: ELSE
				{
				mELSE(); 

				}
				break;
			case 4 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:23: LET
				{
				mLET(); 

				}
				break;
			case 5 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:27: VAL
				{
				mVAL(); 

				}
				break;
			case 6 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:31: FUN
				{
				mFUN(); 

				}
				break;
			case 7 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:35: WHILE
				{
				mWHILE(); 

				}
				break;
			case 8 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:41: DO
				{
				mDO(); 

				}
				break;
			case 9 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:44: TRUE
				{
				mTRUE(); 

				}
				break;
			case 10 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:49: FALSE
				{
				mFALSE(); 

				}
				break;
			case 11 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:55: END
				{
				mEND(); 

				}
				break;
			case 12 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:59: IN
				{
				mIN(); 

				}
				break;
			case 13 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:62: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:65: NUM
				{
				mNUM(); 

				}
				break;
			case 15 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:69: LT
				{
				mLT(); 

				}
				break;
			case 16 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:72: EQ
				{
				mEQ(); 

				}
				break;
			case 17 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:75: PLUS
				{
				mPLUS(); 

				}
				break;
			case 18 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:80: MINUS
				{
				mMINUS(); 

				}
				break;
			case 19 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:86: TIMES
				{
				mTIMES(); 

				}
				break;
			case 20 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:92: DIV
				{
				mDIV(); 

				}
				break;
			case 21 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:96: OR
				{
				mOR(); 

				}
				break;
			case 22 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:99: AND
				{
				mAND(); 

				}
				break;
			case 23 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:103: CEQ
				{
				mCEQ(); 

				}
				break;
			case 24 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:107: SEMI
				{
				mSEMI(); 

				}
				break;
			case 25 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:112: LPAR
				{
				mLPAR(); 

				}
				break;
			case 26 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:117: RPAR
				{
				mRPAR(); 

				}
				break;
			case 27 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:122: LBRA
				{
				mLBRA(); 

				}
				break;
			case 28 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:127: RBRA
				{
				mRBRA(); 

				}
				break;
			case 29 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:132: EP
				{
				mEP(); 

				}
				break;
			case 30 :
				// /Users/main/Documents/proj1-mholmbla/ProjLang.g:1:135: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\10\11\22\uffff\1\47\1\50\11\11\1\62\2\uffff\3\11\1\66\1\67\1"+
		"\70\1\71\2\11\1\uffff\1\74\1\75\1\76\4\uffff\2\11\3\uffff\1\101\1\102"+
		"\2\uffff";
	static final String DFA4_eofS =
		"\103\uffff";
	static final String DFA4_minS =
		"\1\11\1\146\1\150\1\154\1\145\2\141\1\150\1\157\22\uffff\2\60\1\145\1"+
		"\165\1\163\1\144\1\164\1\154\1\156\1\154\1\151\1\60\2\uffff\1\156\2\145"+
		"\4\60\1\163\1\154\1\uffff\3\60\4\uffff\2\145\3\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\156\1\162\1\156\1\145\1\141\1\165\1\150\1\157\22\uffff\2\172"+
		"\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\1\151\1\172\2\uffff\1"+
		"\156\2\145\4\172\1\163\1\154\1\uffff\3\172\4\uffff\2\145\3\uffff\2\172"+
		"\2\uffff";
	static final String DFA4_acceptS =
		"\11\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
		"\1\31\1\32\1\33\1\34\1\35\1\36\14\uffff\1\1\1\14\11\uffff\1\10\3\uffff"+
		"\1\13\1\4\1\5\1\6\2\uffff\1\2\1\11\1\3\2\uffff\1\12\1\7";
	static final String DFA4_specialS =
		"\103\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\31\4\uffff\1\22\1\uffff\1\25\1\26"+
			"\1\17\1\15\1\uffff\1\16\1\uffff\1\20\12\12\1\23\1\24\1\13\1\14\3\uffff"+
			"\32\11\6\uffff\3\11\1\10\1\3\1\6\2\11\1\1\2\11\1\4\7\11\1\2\1\11\1\5"+
			"\1\7\3\11\1\27\1\21\1\30",
			"\1\33\7\uffff\1\34",
			"\1\35\11\uffff\1\36",
			"\1\37\1\uffff\1\40",
			"\1\41",
			"\1\42",
			"\1\44\23\uffff\1\43",
			"\1\45",
			"\1\46",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\1\72",
			"\1\73",
			"",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			"",
			"",
			"",
			"\1\77",
			"\1\100",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | THEN | ELSE | LET | VAL | FUN | WHILE | DO | TRUE | FALSE | END | IN | ID | NUM | LT | EQ | PLUS | MINUS | TIMES | DIV | OR | AND | CEQ | SEMI | LPAR | RPAR | LBRA | RBRA | EP | WS );";
		}
	}

}
