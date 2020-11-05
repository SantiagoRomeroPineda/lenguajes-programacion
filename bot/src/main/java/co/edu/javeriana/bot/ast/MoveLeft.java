
package co.edu.javeriana.bot.ast;



import org.jpavlich.bot.Bot;

public class MoveLeft implements ASTNode {

	private Bot bot;
	private ASTNode number;

	public MoveLeft(Bot bot, ASTNode number) {
		super();
		this.bot = bot;
		this.number = number;
	}

	@Override
	public Object execute(Context context) {
		bot.left((int) number.execute(context));
		return null;
	}

}