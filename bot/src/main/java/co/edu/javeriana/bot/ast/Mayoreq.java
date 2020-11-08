package co.edu.javeriana.bot.ast;


public class Mayoreq implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public Mayoreq(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	public Object execute(Context context) {
		// TODO Auto-generated method stub
		return ( double ) operand1.execute(context) >= ( double) operand2.execute(context);
	}

}