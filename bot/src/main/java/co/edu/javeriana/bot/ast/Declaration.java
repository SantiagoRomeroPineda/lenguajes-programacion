package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Declaration implements ASTNode {

	private String name;
	
	
	
	public Declaration(String name) {
		super();
		this.name = name;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		symbolTable.put(name, new Object());
		return null;
	}

}
