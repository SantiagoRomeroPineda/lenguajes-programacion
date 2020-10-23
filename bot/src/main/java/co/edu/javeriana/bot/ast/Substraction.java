package co.edu.javeriana.bot.ast;

public class Substraction implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public Substraction(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return (int)operand1.execute() - (int)operand2.execute();
	}

}
