
public class IfExp extends Expr {
	public final Expr expr1;
	public final Expr expr2;
	public final Expr expr3;
	
	public IfExp(Expr _expr1, Expr _expr2, Expr _expr3) {
		expr1 = _expr1;
		expr2 = _expr2;
		expr3 = _expr3;
	}
	
	@Override
	public Value eval(Env e) throws EvalError {
		Value cond = expr1.eval(e);
		if(cond instanceof BoolVal)
			if(((BoolVal) cond).value)
				return expr2.eval(e);
			else
				return expr3.eval(e);
		else
			throw new EvalError("Evaluation error: Incompatible arg types");
	}

	@Override
	public String toString() {
		return "if" + expr1.toString() + "then" + expr2.toString() + "else" + expr3.toString();
	}
	
}
