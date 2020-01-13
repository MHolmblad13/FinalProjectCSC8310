
public class WhileExp extends Expr {
	public final Expr expr1;
	public final Expr expr2;
	
	public WhileExp(Expr _expr1, Expr _expr2) {
		expr1 = _expr1;
		expr2 = _expr2;
	}

	public Value eval(Env e) throws EvalError {
		Value v1 = expr1.eval(e);
		
		if(v1 instanceof BoolVal) {
			BoolVal b1 = new BoolVal(((BoolVal)v1).value);
			
			while(((BoolVal)expr1.eval(e)).value) {
				expr2.eval(e);
			}
			return new BoolVal(b1.value);
		}
		
		throw new EvalError("Evaluation error: Incompatible arg types");
	}

	public String toString() {
		return "while" + expr1.toString() + "do" + expr2.toString();
	}

}
