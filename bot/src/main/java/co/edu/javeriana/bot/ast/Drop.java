package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class Drop implements ASTNode {

	private Bot bot;

	public Drop(Bot bot) {
		super();
		this.bot = bot;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		bot.drop();
		return null;
	}

}
