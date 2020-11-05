package co.edu.javeriana.bot.ast;


public class Multiplication implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public Multiplication(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Context context) {
		// TODO Auto-generated method stub
		return (float)operand1.execute(context) * (float)operand2.execute(context);
	}

}