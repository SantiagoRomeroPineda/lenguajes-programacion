package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class MoveDown implements ASTNode {

	private Bot bot;
	private ASTNode number;

	
	
	public MoveDown(Bot bot, ASTNode number) {
		super();
		this.bot = bot;
		this.number = number;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		bot.down((int) number.execute(symbolTable));
		return null;
	}

}
