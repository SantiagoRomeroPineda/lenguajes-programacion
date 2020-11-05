package co.edu.javeriana.bot.ast;

public class Assignment implements ASTNode {

	private String name;
	private ASTNode expression;
	
	
	public Assignment(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}


	@Override
	public Object execute(Context context) {
		if (context.get(name)==null) {
			
			context.declaration(name);
			
		}
		
		context.assigment(name, expression.execute(context));
		return null;
	}

}