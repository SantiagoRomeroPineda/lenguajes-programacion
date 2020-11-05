package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Not implements ASTNode {
	private ASTNode condition;


	public Not(ASTNode condition) {
		super();
		this.condition = condition;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		return !((boolean) condition.execute(symbolTable));
	}

}