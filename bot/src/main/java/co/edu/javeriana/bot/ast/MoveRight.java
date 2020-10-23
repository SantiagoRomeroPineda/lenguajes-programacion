package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class MoveRight implements ASTNode {

	private Bot bot;
	private ASTNode number;

	
	
	public MoveRight(Bot bot, ASTNode number) {
		super();
		this.bot = bot;
		this.number = number;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		bot.right((int) number.execute(symbolTable));
		return null;
	}

}
