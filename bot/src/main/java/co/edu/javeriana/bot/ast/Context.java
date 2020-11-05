package co.edu.javeriana.bot.ast;

import java.util.HashMap;

public class Context {
	private HashMap<String, Object> variables;
	protected Context anterior =null;
	
	public Context(Context ant){
		this.variables = new HashMap<String, Object>();
		this.anterior = ant;
	}
	
	public Context() {
		this.variables=new HashMap<String, Object>();
	}
	
	public void declaration(String key) {
		this.variables.put(key, new Object());
	}
	public void put(String key, Object value) {
	
		this.variables.put(key, value);
		
	}
	
	public boolean existsKey(String key) {
		return (this.variables.containsKey(key));
	}
	
	public void assigment(String key, Object value) {
		Object found = null;
		for (Context context = this; context != null; context = context.anterior) {
			found = (Object) (context.variables.get(key));
			if (found != null) {
				context.put(key, value);
				return;
			}
		}
		
	}
	
	public Object get(String id) {
		Object found = null;
		for (Context context = this; context != null; context = context.anterior) {
			found = (Object) (context.variables.get(id));
			if (found != null) {
				return found;
			}
		}
		return found;
	}
	
}
