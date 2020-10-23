package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Output implements ASTNode {
	private ASTNode data;
	
	public Output(ASTNode data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println(data.execute(symbolTable));
		return null;
	}

}
