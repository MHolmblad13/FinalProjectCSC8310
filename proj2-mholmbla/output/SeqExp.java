
public class SeqExp extends Expr {
	public final Expr expr1;
	public final Expr expr2;
	
  public SeqExp(Expr _expr1, Expr _expr2) {
    expr1 = _expr1;
    expr2 = _expr2;
  }
  
	@Override
	public Value eval(Env e) throws EvalError {
		Value v1 = expr1.eval(e);
		Value v2 = expr2.eval(e);
		return v2;
		
	}

	@Override
	public String toString() {
		return "{" + expr1.toString() + ";" + expr2.toString() + "}";
	}
}
