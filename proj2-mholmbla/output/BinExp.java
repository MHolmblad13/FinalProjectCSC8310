
public class BinExp extends Expr {
	public final BinOp binOp;
	public final Expr expr1;
	public final Expr expr2;
	
	public BinExp(BinOp _binOp, Expr _expr1, Expr _expr2) {
		binOp = _binOp;
		expr1 = _expr1;
		expr2 = _expr2;
	}
	
	public Value eval(Env e) throws EvalError {
		Value v1 = expr1.eval(e);
		
		if(v1 instanceof BoolVal) {
			BoolVal b1 = new BoolVal(((BoolVal)v1).value);
			
			switch(binOp){
				case AND:
					if(b1.value == false)
						return new BoolVal(b1.value);
					else
						return expr2.eval(e);
				case OR:
					if(b1.value)
						return new BoolVal(b1.value);
					else{
						return expr2.eval(e);	
					}
				case EQ:
					Value v2 = expr2.eval(e);
					if(v2 instanceof BoolVal){
						BoolVal b2 = new BoolVal(((BoolVal)v1).value);
						return new BoolVal(b1.value == b2.value);
					}
				default:
					throw new EvalError("Evaluation error: Incompatible arg types");
			}
		} 

		Value v2 = expr2.eval(e);

		if(v1 instanceof IntVal && v2 instanceof IntVal){
			IntVal i1 = new IntVal(((IntVal)v1).value);
			IntVal i2 = new IntVal(((IntVal)v2).value);
			
			switch(binOp) {
				case PLUS:
					return new IntVal(i1.value + i2.value);
				case TIMES:
					return new IntVal(i1.value * i2.value);
				case MINUS:
					return new IntVal(i1.value - i2.value);
				case DIV:
					return new IntVal(i1.value / i2.value);
				case EQ:
					return new BoolVal(i1.value == i2.value);
				case LT:
					return new BoolVal(i1.value < i2.value);
				default:
					throw new EvalError("Evaluation error: Incompatible arg types");
			}
		}
		throw new EvalError("Evaluation error: Incompatible arg types");
	}

	public String toString() {
		return expr1.toString() + binOp.toString() + expr2.toString();
	}

}
