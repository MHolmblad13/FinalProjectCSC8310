// $ANTLR 3.5.2 /Users/main/Documents/proj1-mholmbla/ProjLang.g 2019-12-11 13:20:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CEQ", "DIGIT", "DIV", 
		"DO", "ELSE", "END", "EP", "EQ", "FALSE", "FUN", "ID", "IF", "IN", "LBRA", 
		"LET", "LETTER", "LPAR", "LT", "MINUS", "NUM", "OR", "PLUS", "RBRA", "RPAR", 
		"SEMI", "THEN", "TIMES", "TRUE", "VAL", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/main/Documents/proj1-mholmbla/ProjLang.g"; }



	// $ANTLR start "input"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:43:1: input returns [Expr e] : a1= expr SEMI ;
	public final Expr input() throws RecognitionException {
		Expr e = null;


		Expr a1 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:43:24: (a1= expr SEMI )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:43:26: a1= expr SEMI
			{
			pushFollow(FOLLOW_expr_in_input291);
			a1=expr();
			state._fsp--;

			e = a1;
			match(input,SEMI,FOLLOW_SEMI_in_input295); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:45:1: expr returns [Expr e] : ( IF e1= expr THEN e2= expr ELSE e3= expr | LET VAL ID EQ e1= expr IN e2= expr END | LET FUN id1= ID LPAR id2= ID RPAR EQ e1= expr 'in' e2= expr END | WHILE e1= expr DO e2= expr | LBRA e1= expr ( SEMI e2= expr )* RBRA | EP e1= expr |id= ID CEQ e1= expr |a1= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr e = null;


		Token id1=null;
		Token id2=null;
		Token id=null;
		Token ID1=null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;
		Expr a1 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:45:22: ( IF e1= expr THEN e2= expr ELSE e3= expr | LET VAL ID EQ e1= expr IN e2= expr END | LET FUN id1= ID LPAR id2= ID RPAR EQ e1= expr 'in' e2= expr END | WHILE e1= expr DO e2= expr | LBRA e1= expr ( SEMI e2= expr )* RBRA | EP e1= expr |id= ID CEQ e1= expr |a1= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LBRA:
				{
				alt2=5;
				}
				break;
			case EP:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==AND||(LA2_6 >= DIV && LA2_6 <= END)||LA2_6==EQ||LA2_6==IN||(LA2_6 >= LPAR && LA2_6 <= MINUS)||(LA2_6 >= OR && LA2_6 <= TIMES)) ) {
					alt2=8;
				}
				else if ( (LA2_6==CEQ) ) {
					alt2=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAR:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:45:24: IF e1= expr THEN e2= expr ELSE e3= expr
					{
					match(input,IF,FOLLOW_IF_in_expr306); 
					pushFollow(FOLLOW_expr_in_expr312);
					e1=expr();
					state._fsp--;

					e = e1;
					match(input,THEN,FOLLOW_THEN_in_expr316); 
					pushFollow(FOLLOW_expr_in_expr322);
					e2=expr();
					state._fsp--;

					e = e2;
					match(input,ELSE,FOLLOW_ELSE_in_expr326); 
					pushFollow(FOLLOW_expr_in_expr332);
					e3=expr();
					state._fsp--;

					e = new IfExp(e1, e2, e3);
					}
					break;
				case 2 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:46:4: LET VAL ID EQ e1= expr IN e2= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr340); 
					match(input,VAL,FOLLOW_VAL_in_expr342); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_expr344); 
					match(input,EQ,FOLLOW_EQ_in_expr346); 
					pushFollow(FOLLOW_expr_in_expr352);
					e1=expr();
					state._fsp--;

					e = e1;
					match(input,IN,FOLLOW_IN_in_expr356); 
					pushFollow(FOLLOW_expr_in_expr362);
					e2=expr();
					state._fsp--;

					e = e2;
					match(input,END,FOLLOW_END_in_expr366); 
					e = new LetValExp((ID1!=null?ID1.getText():null), e1, e2);
					}
					break;
				case 3 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:47:4: LET FUN id1= ID LPAR id2= ID RPAR EQ e1= expr 'in' e2= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr374); 
					match(input,FUN,FOLLOW_FUN_in_expr376); 
					id1=(Token)match(input,ID,FOLLOW_ID_in_expr382); 
					id1.getText();
					match(input,LPAR,FOLLOW_LPAR_in_expr386); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_expr392); 
					id2.getText();
					match(input,RPAR,FOLLOW_RPAR_in_expr396); 
					match(input,EQ,FOLLOW_EQ_in_expr398); 
					pushFollow(FOLLOW_expr_in_expr404);
					e1=expr();
					state._fsp--;

					e = e1;
					match(input,IN,FOLLOW_IN_in_expr408); 
					pushFollow(FOLLOW_expr_in_expr414);
					e2=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr416); 
					e = new LetFunExp((id1!=null?id1.getText():null),(id2!=null?id2.getText():null), e, e2);
					}
					break;
				case 4 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:48:4: WHILE e1= expr DO e2= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr424); 
					pushFollow(FOLLOW_expr_in_expr430);
					e1=expr();
					state._fsp--;

					e = e1;
					match(input,DO,FOLLOW_DO_in_expr434); 
					pushFollow(FOLLOW_expr_in_expr440);
					e2=expr();
					state._fsp--;

					e = new WhileExp(e1, e2);
					}
					break;
				case 5 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:49:4: LBRA e1= expr ( SEMI e2= expr )* RBRA
					{
					match(input,LBRA,FOLLOW_LBRA_in_expr448); 
					pushFollow(FOLLOW_expr_in_expr454);
					e1=expr();
					state._fsp--;

					e = e1;
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:49:33: ( SEMI e2= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /Users/main/Documents/proj1-mholmbla/ProjLang.g:49:34: SEMI e2= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr459); 
							pushFollow(FOLLOW_expr_in_expr465);
							e2=expr();
							state._fsp--;

							e =e2;
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RBRA,FOLLOW_RBRA_in_expr471); 
					e = new SeqExp(e1, e2);
					}
					break;
				case 6 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:50:4: EP e1= expr
					{
					match(input,EP,FOLLOW_EP_in_expr478); 
					pushFollow(FOLLOW_expr_in_expr484);
					e1=expr();
					state._fsp--;

					e = new NotExp(e1);
					}
					break;
				case 7 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:51:4: id= ID CEQ e1= expr
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_expr496); 
					id.getText();
					match(input,CEQ,FOLLOW_CEQ_in_expr500); 
					pushFollow(FOLLOW_expr_in_expr506);
					e1=expr();
					state._fsp--;

					e = new AssnExp((id!=null?id.getText():null), e1);
					}
					break;
				case 8 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:52:4: a1= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr518);
					a1=relexpr();
					state._fsp--;

					e = a1;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:55:1: relexpr returns [Expr e] : a1= arithexpr ( LT a2= arithexpr | EQ a3= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr e = null;


		Expr a1 =null;
		Expr a2 =null;
		Expr a3 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:55:25: (a1= arithexpr ( LT a2= arithexpr | EQ a3= arithexpr )? )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:55:27: a1= arithexpr ( LT a2= arithexpr | EQ a3= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr538);
			a1=arithexpr();
			state._fsp--;

			e = a1;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:55:55: ( LT a2= arithexpr | EQ a3= arithexpr )?
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LT) ) {
				alt3=1;
			}
			else if ( (LA3_0==EQ) ) {
				alt3=2;
			}
			switch (alt3) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:55:56: LT a2= arithexpr
					{
					match(input,LT,FOLLOW_LT_in_relexpr542); 
					pushFollow(FOLLOW_arithexpr_in_relexpr548);
					a2=arithexpr();
					state._fsp--;

					e = new BinExp(BinOp.LT, e, a2);
					}
					break;
				case 2 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:56:4: EQ a3= arithexpr
					{
					match(input,EQ,FOLLOW_EQ_in_relexpr555); 
					pushFollow(FOLLOW_arithexpr_in_relexpr561);
					a3=arithexpr();
					state._fsp--;

					e = new BinExp(BinOp.EQ, e, a3);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:59:1: arithexpr returns [Expr e] : t1= term ( PLUS t2= term | MINUS t3= term | OR t4= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr e = null;


		Expr t1 =null;
		Expr t2 =null;
		Expr t3 =null;
		Expr t4 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:59:27: (t1= term ( PLUS t2= term | MINUS t3= term | OR t4= term )* )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:59:29: t1= term ( PLUS t2= term | MINUS t3= term | OR t4= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr582);
			t1=term();
			state._fsp--;

			e = t1;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:59:53: ( PLUS t2= term | MINUS t3= term | OR t4= term )*
			loop4:
			while (true) {
				int alt4=4;
				switch ( input.LA(1) ) {
				case PLUS:
					{
					alt4=1;
					}
					break;
				case MINUS:
					{
					alt4=2;
					}
					break;
				case OR:
					{
					alt4=3;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:59:54: PLUS t2= term
					{
					match(input,PLUS,FOLLOW_PLUS_in_arithexpr587); 
					pushFollow(FOLLOW_term_in_arithexpr593);
					t2=term();
					state._fsp--;

					e = new BinExp(BinOp.PLUS, e, t2);
					}
					break;
				case 2 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:60:4: MINUS t3= term
					{
					match(input,MINUS,FOLLOW_MINUS_in_arithexpr600); 
					pushFollow(FOLLOW_term_in_arithexpr606);
					t3=term();
					state._fsp--;

					e = new BinExp(BinOp.MINUS, e, t3);
					}
					break;
				case 3 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:61:10: OR t4= term
					{
					match(input,OR,FOLLOW_OR_in_arithexpr619); 
					pushFollow(FOLLOW_term_in_arithexpr625);
					t4=term();
					state._fsp--;

					e = new BinExp(BinOp.OR, e, t4);
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:64:1: term returns [Expr e] : f1= factor ( TIMES f2= factor | DIV f2= factor | AND f2= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr e = null;


		Expr f1 =null;
		Expr f2 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:64:22: (f1= factor ( TIMES f2= factor | DIV f2= factor | AND f2= factor )* )
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:64:24: f1= factor ( TIMES f2= factor | DIV f2= factor | AND f2= factor )*
			{
			pushFollow(FOLLOW_factor_in_term646);
			f1=factor();
			state._fsp--;

			e = f1;
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:64:49: ( TIMES f2= factor | DIV f2= factor | AND f2= factor )*
			loop5:
			while (true) {
				int alt5=4;
				switch ( input.LA(1) ) {
				case TIMES:
					{
					alt5=1;
					}
					break;
				case DIV:
					{
					alt5=2;
					}
					break;
				case AND:
					{
					alt5=3;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:64:50: TIMES f2= factor
					{
					match(input,TIMES,FOLLOW_TIMES_in_term650); 
					pushFollow(FOLLOW_factor_in_term656);
					f2=factor();
					state._fsp--;

					e = new BinExp(BinOp.TIMES, e, f2);
					}
					break;
				case 2 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:65:4: DIV f2= factor
					{
					match(input,DIV,FOLLOW_DIV_in_term663); 
					pushFollow(FOLLOW_factor_in_term669);
					f2=factor();
					state._fsp--;

					e = new BinExp(BinOp.DIV, e, f2);
					}
					break;
				case 3 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:66:4: AND f2= factor
					{
					match(input,AND,FOLLOW_AND_in_term676); 
					pushFollow(FOLLOW_factor_in_term682);
					f2=factor();
					state._fsp--;

					e = new BinExp(BinOp.AND, e, f2);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// /Users/main/Documents/proj1-mholmbla/ProjLang.g:69:1: factor returns [Expr e] : ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR expr RPAR );
	public final Expr factor() throws RecognitionException {
		Expr e = null;


		Token NUM2=null;
		Token TRUE3=null;
		Token FALSE4=null;
		Token ID5=null;
		Token ID6=null;
		Expr e1 =null;
		Expr expr7 =null;

		try {
			// /Users/main/Documents/proj1-mholmbla/ProjLang.g:69:24: ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR expr RPAR )
			int alt6=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt6=1;
				}
				break;
			case TRUE:
				{
				alt6=2;
				}
				break;
			case FALSE:
				{
				alt6=3;
				}
				break;
			case ID:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==LPAR) ) {
					alt6=5;
				}
				else if ( (LA6_4==AND||(LA6_4 >= DIV && LA6_4 <= END)||LA6_4==EQ||LA6_4==IN||(LA6_4 >= LT && LA6_4 <= MINUS)||(LA6_4 >= OR && LA6_4 <= TIMES)) ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAR:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:69:26: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_factor699); 
					e = new IntConst(Integer.parseInt((NUM2!=null?NUM2.getText():null)));
					}
					break;
				case 2 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:70:4: TRUE
					{
					TRUE3=(Token)match(input,TRUE,FOLLOW_TRUE_in_factor706); 
					e = new BoolConst(Boolean.parseBoolean((TRUE3!=null?TRUE3.getText():null)));
					}
					break;
				case 3 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:71:4: FALSE
					{
					FALSE4=(Token)match(input,FALSE,FOLLOW_FALSE_in_factor713); 
					e = new BoolConst(Boolean.parseBoolean((FALSE4!=null?FALSE4.getText():null)));
					}
					break;
				case 4 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:72:4: ID
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_factor720); 
					e = new VarExp((ID5!=null?ID5.getText():null));
					}
					break;
				case 5 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:73:5: ID LPAR e1= expr RPAR
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_factor728); 
					match(input,LPAR,FOLLOW_LPAR_in_factor730); 
					pushFollow(FOLLOW_expr_in_factor736);
					e1=expr();
					state._fsp--;

					e = e1;
					match(input,RPAR,FOLLOW_RPAR_in_factor740); 
					e = new AppExp((ID6!=null?ID6.getText():null), e1);
					}
					break;
				case 6 :
					// /Users/main/Documents/proj1-mholmbla/ProjLang.g:74:4: LPAR expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor747); 
					pushFollow(FOLLOW_expr_in_factor749);
					expr7=expr();
					state._fsp--;

					e = expr7;
					match(input,RPAR,FOLLOW_RPAR_in_factor753); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input291 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMI_in_input295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr306 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr312 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_THEN_in_expr316 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr322 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr326 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr340 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAL_in_expr342 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr344 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_in_expr346 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr352 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_expr356 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr374 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_FUN_in_expr376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr382 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAR_in_expr386 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr392 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAR_in_expr396 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQ_in_expr398 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_expr408 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr414 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr424 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr434 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRA_in_expr448 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr454 = new BitSet(new long[]{0x0000000028000000L});
	public static final BitSet FOLLOW_SEMI_in_expr459 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr465 = new BitSet(new long[]{0x0000000028000000L});
	public static final BitSet FOLLOW_RBRA_in_expr471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_expr478 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr496 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CEQ_in_expr500 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_expr506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr538 = new BitSet(new long[]{0x0000000000401002L});
	public static final BitSet FOLLOW_LT_in_relexpr542 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relexpr555 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr582 = new BitSet(new long[]{0x0000000006800002L});
	public static final BitSet FOLLOW_PLUS_in_arithexpr587 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_term_in_arithexpr593 = new BitSet(new long[]{0x0000000006800002L});
	public static final BitSet FOLLOW_MINUS_in_arithexpr600 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_term_in_arithexpr606 = new BitSet(new long[]{0x0000000006800002L});
	public static final BitSet FOLLOW_OR_in_arithexpr619 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_term_in_arithexpr625 = new BitSet(new long[]{0x0000000006800002L});
	public static final BitSet FOLLOW_factor_in_term646 = new BitSet(new long[]{0x0000000080000092L});
	public static final BitSet FOLLOW_TIMES_in_term650 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_factor_in_term656 = new BitSet(new long[]{0x0000000080000092L});
	public static final BitSet FOLLOW_DIV_in_term663 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_factor_in_term669 = new BitSet(new long[]{0x0000000080000092L});
	public static final BitSet FOLLOW_AND_in_term676 = new BitSet(new long[]{0x000000010120A000L});
	public static final BitSet FOLLOW_factor_in_term682 = new BitSet(new long[]{0x0000000080000092L});
	public static final BitSet FOLLOW_NUM_in_factor699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor728 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAR_in_factor730 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_factor736 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAR_in_factor740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor747 = new BitSet(new long[]{0x00000005012DA800L});
	public static final BitSet FOLLOW_expr_in_factor749 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAR_in_factor753 = new BitSet(new long[]{0x0000000000000002L});
}
