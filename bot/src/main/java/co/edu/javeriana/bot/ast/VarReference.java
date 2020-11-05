package co.edu.javeriana.bot.ast;


public class VarReference implements ASTNode {

	private String name;
	
	
	public VarReference(String name) {
		super();
		this.name = name;
	}


	@Override
	public Object execute(Context context) {
		return context.get(name);
		 
	}

}