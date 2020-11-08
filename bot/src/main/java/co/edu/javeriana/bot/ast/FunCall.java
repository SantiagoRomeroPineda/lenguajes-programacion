package co.edu.javeriana.bot.ast;

import java.util.List;

public class FunCall implements ASTNode {

	private String name;
	private List<ASTNode> head;
	
	
	
	public FunCall(String name, List<ASTNode> head) {
		super();
		this.name = name;
		this.head = head;
	}



	@Override
	public Object execute(Context context) {
		FunDeclaration function = (FunDeclaration) context.get(name);
		Context newContext = new Context(context);
		int i = 0;

		for(String parameter : function.getHead()) {
			newContext.put(parameter, ((ASTNode) this.head.get(i++)).execute(context));
		}
		for (ASTNode node : function.getBody()) {
			node.execute(newContext);
		}
		return null;
	}

}