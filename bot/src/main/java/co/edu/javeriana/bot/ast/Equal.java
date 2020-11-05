package co.edu.javeriana.bot.ast;


public class Equal implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public Equal(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Context context) {
		// TODO Auto-generated method stub
		return ( Object ) operand1.execute(context) == ( Object ) operand2.execute(context);
	}

}