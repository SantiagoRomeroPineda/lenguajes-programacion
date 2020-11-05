package co.edu.javeriana.bot.ast;

import java.util.List;

public class While implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;

	public While(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	public Object execute(Context context) {
		
		while ((boolean) condition.execute(context)) {
			Context nContext = new Context(context);
			
			for (ASTNode n : body) {
				n.execute(nContext);
			}
		}
		return null;
	}

}