package co.edu.javeriana.bot.ast;


public class And implements ASTNode {
	private ASTNode condition;
	private ASTNode condition2;


	public And(ASTNode condition, ASTNode condition2) {
		super();
		this.condition = condition;
		this.condition2 = condition2;
	}

	@Override
	public Object execute(Context context) {
		
		return (boolean) condition.execute(context) && (boolean) condition2.execute(context);
	}

}