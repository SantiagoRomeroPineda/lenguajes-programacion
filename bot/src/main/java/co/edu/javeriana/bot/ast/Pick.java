package co.edu.javeriana.bot.ast;

import org.jpavlich.bot.Bot;

public class Pick implements ASTNode {

	private Bot bot;

	public Pick(Bot bot) {
		super();
		this.bot = bot;
	}

	@Override
	public Object execute(Context context) {
		bot.pick();
		return null;
	}

}