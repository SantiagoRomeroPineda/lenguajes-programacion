package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Assignment implements ASTNode {

	private String name;
	private ASTNode expression;
	
	
	public Assignment(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println("estoy aqui");
		symbolTable.put(name, expression.execute(symbolTable));
		return null;
	}

}
