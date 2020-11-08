package co.edu.javeriana.bot.ast;

import java.util.Scanner;

public class Input implements ASTNode {
	
	private String id;
	
	
	
	public Input(String id) {
		super();
		this.id = id;
	}
	@Override
	public Object execute(Context context) {
		if (context.get(id)==null) {
			
			context.declaration(id);
			
		}
		context.put(id, new Object());
		Scanner sc= new Scanner(System.in); 
		String str= sc.nextLine();
		context.assigment(id, str);

		return null;
	}

}
