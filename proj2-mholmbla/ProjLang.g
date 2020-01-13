grammar ProjLang;

fragment LETTER	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	:	'0'..'9';

IF	:	'if';
THEN	:	'then';
ELSE	:	'else';
LET	:	'let';
VAL	:	'val';
FUN	:	'fun';
WHILE	:	'while';
DO	:	'do';
TRUE	:	'true';
FALSE	:	'false';
END	:	'end';
IN	:	'in';
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
//ADDOP	:	'+' | '-' | '|';
//MULOP	:	'*' | '/' | '&';
//RELOP	:	'<' | '=';

LT	:	'<';
EQ	:	'=';
PLUS	:	'+';
MINUS	:	'-';
TIMES	:	'*';
DIV	:	'/';
OR	:	'|';
AND	:	'&';

CEQ	: ':=';
SEMI	: ';';
LPAR	: '(';
RPAR	: ')';
LBRA	: '{';
RBRA	: '}';
EP	: '!';

WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

input 	returns [Expr e]: a1 = expr {$e = $a1.e;} SEMI;

expr	returns [Expr e]: IF e1 = expr {$e = $e1.e;} THEN e2 = expr {$e = $e2.e;} ELSE e3 = expr {$e = new IfExp($e1.e, $e2.e, $e3.e);} //if exp
	|	LET VAL ID EQ e1 = expr {$e = $e1.e;} IN e2 = expr {$e = $e2.e;} END {$e = new LetValExp($ID.text, $e1.e, $e2.e);} // let val
	|	LET FUN id1 = ID {$id1.getText();} LPAR id2 = ID {$id2.getText();} RPAR EQ e1 = expr {$e = $e1.e;} 'in' e2 = expr END {$e = new LetFunExp($id1.text,$id2.text, $e, $e2.e);} // let fun
	|	WHILE e1 = expr {$e = $e1.e;} DO e2 = expr {$e = new WhileExp($e1.e, $e2.e);} // while exp
	|	LBRA e1 = expr {$e = $e1.e;} (SEMI e2 = expr {$e=$e2.e;})* RBRA {$e = new SeqExp($e1.e, $e2.e);}// seq
	|	EP e1 = expr {$e = new NotExp($e1.e);} // Not Exp
	|	id = ID {$id.getText();} CEQ e1 = expr {$e = new AssnExp($id.text, $e1.e);} // assn exp
	|	a1 = relexpr {$e = $a1.e;}
	;
	
relexpr	returns [Expr e]:	a1 = arithexpr {$e = $a1.e;}(LT a2 = arithexpr {$e = new BinExp(BinOp.LT, $e, $a2.e);}
	|	EQ a3 = arithexpr {$e = new BinExp(BinOp.EQ, $e, $a3.e);})?
	;

arithexpr returns [Expr e]:	t1 = term {$e = $t1.e;} (PLUS t2 = term {$e = new BinExp(BinOp.PLUS, $e, $t2.e);}
	|	MINUS t3 = term {$e = new BinExp(BinOp.MINUS, $e, $t3.e);}
	|       OR t4 = term {$e = new BinExp(BinOp.OR, $e, $t4.e);})*
	;

term	returns [Expr e]:	f1 = factor {$e = $f1.e;}(TIMES f2 = factor {$e = new BinExp(BinOp.TIMES, $e, $f2.e);}
	| DIV f2 = factor {$e = new BinExp(BinOp.DIV, $e, $f2.e);}
	| AND f2 = factor {$e = new BinExp(BinOp.AND, $e, $f2.e);})*
	;

factor	returns [Expr e]: NUM {$e = new IntConst(Integer.parseInt($NUM.text));}
	|	TRUE {$e = new BoolConst(Boolean.parseBoolean($TRUE.text));}
	|	FALSE {$e = new BoolConst(Boolean.parseBoolean($FALSE.text));}
	|	ID {$e = new VarExp($ID.text);}
	| 	ID LPAR e1 = expr {$e = $e1.e;} RPAR {$e = new AppExp($ID.text, $e1.e);}//app exp
	|	LPAR expr {$e = $expr.e;} RPAR;