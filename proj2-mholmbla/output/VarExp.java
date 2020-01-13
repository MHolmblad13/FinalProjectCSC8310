
public class VarExp extends Expr {
	public final String string;
  
	public VarExp(String _string) {
      string = _string;
    }

	public Value eval(Env e) throws EvalError {
		return e.lookup(string);
	}

	public String toString() {
		return string;
	}

}
