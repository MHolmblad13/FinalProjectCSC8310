
public class FunVal extends Value {
    public final String value;
    public final Expr e;
    public final Env env;
    
    public FunVal(String _value, Expr _e, Env _env) {
		value = _value;
    	e = _e;
    	env = _env;
    }
    
    public String toString() {
    	return env.toString();
    }
}

