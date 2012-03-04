

public class FunctionList {
	private HashMap<String, Function> functionList;
	
	public void printFunctions(){
		System.out.println(functionList.keySet());
	}
	
	public String getFunctionDescription(String name){
		return functionList.get(name).toString();
	}
	
}
