package co.edu.javeriana.bot.ast;

import org.jpavlich.bot.Bot;

public class Drop implements ASTNode {

	private Bot bot;

	public Drop(Bot bot) {
		super();
		this.bot = bot;
	}

	@Override
	public Object execute(Context context) {
		bot.drop();
		return null;
	}

}