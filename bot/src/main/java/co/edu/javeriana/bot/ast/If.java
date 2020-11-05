
package co.edu.javeriana.bot.ast;

import java.util.List;

public class If implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;

	
	
	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}



	@Override
	public Object execute(Context context) {
		
		if ((boolean) condition.execute(context)) {
			Context nContext= new Context(context);
			for (ASTNode n : body) {
				n.execute(nContext);
			}
		} else {
			Context nContext= new Context(context);
			for (ASTNode n : elseBody) {
				n.execute(nContext);
			}
		}
		return null;
	}

}