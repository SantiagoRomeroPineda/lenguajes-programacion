package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Or implements ASTNode {
	private ASTNode condition;
	private ASTNode condition2;


	public Or(ASTNode condition, ASTNode condition2) {
		super();
		this.condition = condition;
		this.condition2 = condition2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		return (boolean) condition.execute(symbolTable) || (boolean) condition2.execute(symbolTable);
	}

}