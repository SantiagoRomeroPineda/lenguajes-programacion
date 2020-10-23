package co.edu.javeriana.bot.ast;
import org.jpavlich.bot.Bot;
public class MoveUp implements ASTNode {

	private Bot bot;
	private ASTNode number;

	
	
	public MoveUp(Bot bot, ASTNode number) {
		super();
		this.bot = bot;
		this.number = number;
	}



	@Override
	public Object execute() {
		bot.up((int) number.execute());
		return null;
	}
}
