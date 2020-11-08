
package co.edu.javeriana.bot.ast;

import java.util.List;

public class FunDeclaration implements ASTNode {
	private String name;
	private List<String> head;
	private List<ASTNode> body;

	
	
	public FunDeclaration(String name, List<String> head, List<ASTNode> body) {
		super();
		this.name = name;
		this.head = head;
		this.body = body;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<String> getHead() {
		return head;
	}



	public void setHead(List<String> head) {
		this.head = head;
	}



	public List<ASTNode> getBody() {
		return body;
	}



	public void setBody(List<ASTNode> body) {
		this.body = body;
	}



	@Override
	public Object execute(Context symbolTable) {
		symbolTable.put(name,this);
		return null;
	}

}