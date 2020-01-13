public class AssnExp extends Expr {
	public final String string;
	public final Expr expr;
	
	public AssnExp(String _string, Expr _expr) {
		string = _string;
		expr = _expr;
	}
	
	public Value eval(Env e) throws EvalError {

		Value value1 = e.lookup(string);
		Value value2 = expr.eval(e);

		if(value1.getClass().equals(value2.getClass())){
			e.updateBinding(string, expr.eval(e));
			return value2;
		}
		
		throw new EvalError("Incompatible Types in assignment");
	}

	public String toString() {
		return string + ":=" + expr.toString();
	}

}
