package co.edu.javeriana.bot.ast;

import java.util.List;

public class Output implements ASTNode {
	private List<ASTNode> data;
	
	public Output(List<ASTNode> data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute(Context context) {
		for(ASTNode val:data) {
			System.out.print(val.execute(context));	
		}
		System.out.println();
		
		return null;
	}

}