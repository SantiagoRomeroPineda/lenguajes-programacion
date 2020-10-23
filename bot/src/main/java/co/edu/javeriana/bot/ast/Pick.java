package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class Pick implements ASTNode {

	private Bot bot;

	public Pick(Bot bot) {
		super();
		this.bot = bot;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		bot.pick();
		return null;
	}

}
