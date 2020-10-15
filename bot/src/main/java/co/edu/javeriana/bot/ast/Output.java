package co.edu.javeriana.bot.ast;

public class Output implements ASTNode {
	private ASTNode data;
	
	public Output(ASTNode data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute() {
		System.out.println(data.execute());
		return null;
	}

}
