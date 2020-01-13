
public class LetValExp extends Expr {
	public final String string;
	public final Expr expr1;
    public final Expr expr2;
	
	public LetValExp(String _string, Expr _expr1, Expr _expr2) {
    string = _string;
    expr1 = _expr1;
    expr2 = _expr2;
  }
	@Override
	public Value eval(Env e) throws EvalError {
		Value v1 = expr1.eval(e);
		Env newEnv = e.addBinding(string, v1);
		return expr2.eval(newEnv);
	}

	@Override
	public String toString() {
		return "let" + "val" + string + "=" + expr1.toString() + "in" + expr2.toString() + "end";
	}

}
