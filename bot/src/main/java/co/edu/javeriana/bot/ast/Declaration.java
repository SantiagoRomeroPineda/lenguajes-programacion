package co.edu.javeriana.bot.ast;


public class Declaration implements ASTNode {

	private String name;
	
	
	
	public Declaration(String name) {
		super();
		this.name = name;
	}



	@Override
	public Object execute(Context context) {
		context.put(name, new Object());
		return null;
	}

}