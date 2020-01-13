
public class AppExp extends Expr {
	public final String string;
	public final Expr expr;
	
	public AppExp(String _string, Expr _expr) {
		string = _string;
		expr = _expr;
	}
	
	@Override
	public Value eval(Env e) throws EvalError {
		Value v1 = e.lookup(string);
		if (v1 instanceof FunVal){
			FunVal funVal = (FunVal)v1;
			Value v2 = expr.eval(e);
			Env env = funVal.env.addBinding(funVal.value, v2);
			return funVal.e.eval(env);
		}
		throw new EvalError("Incompatible Types");
	}

	@Override
	public String toString() {
		return string + "("+ expr.toString() + ")";
	}

}
