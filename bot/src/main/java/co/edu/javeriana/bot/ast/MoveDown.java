package co.edu.javeriana.bot.ast;

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
	public Object execute() {
		bot.down((int) number.execute());
		return null;
	}

}
