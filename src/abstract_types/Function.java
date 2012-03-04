package abstract_types;

public class Function {
	
	private String name;
	private boolean isExecuting;
	private String simpleDescription;
	private String verboseDescription;
	
	public Function (String name){
		this.name = name;
		}
	
	public String getName(){
		return name;
	}
	
}
