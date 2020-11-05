package co.edu.javeriana.bot.ast;


public class Not implements ASTNode {
	private ASTNode condition;


	public Not(ASTNode condition) {
		super();
		this.condition = condition;
	}

	@Override
	public Object execute(Context context) {
		
		return !((boolean) condition.execute(context));
	}

}