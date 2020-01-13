
public class LetFunExp extends Expr {
	public final String string1;
	public final String string2;
	public final Expr expr1;
	public final Expr expr2;
  
	public LetFunExp(String _string1, String _string2, Expr _expr1, Expr _expr2) {
    string1 = _string1;
    string2 = _string2;
    expr1 = _expr1;
    expr2 = _expr2;
  }
	
	@Override
	public Value eval(Env e) throws EvalError {
		Value dummy = new FunVal(string1, null, null);
		e = e.addBinding(string1, dummy);
		FunVal funVal = new FunVal(string2, expr1, e);
		e.updateBinding(string1, funVal);
		return expr2.eval(e);
	}

	@Override
	public String toString() {
		return "let"+"fun"+ string1 + "(" + string2 + ")" + "=" + expr1.toString() + "in" + expr2.toString()+"end";
	}

}
