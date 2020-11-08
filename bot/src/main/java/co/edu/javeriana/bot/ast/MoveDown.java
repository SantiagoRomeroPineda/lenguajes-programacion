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
	public Object execute(Context context) {
		double data =  (double) number.execute(context);
		Double newData = new Double(data);
		int value = newData.intValue();
		bot.down((int) value);
		return null;
	}

}