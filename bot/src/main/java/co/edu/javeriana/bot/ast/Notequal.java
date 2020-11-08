package co.edu.javeriana.bot.ast;


public class Notequal implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public Notequal(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	


	@Override
	public Object execute(Context context) {
		// TODO Auto-generated method stub
		return  ( Object ) !operand1.execute(context).equals(( Object ) operand2.execute(context)) ;
	}

}