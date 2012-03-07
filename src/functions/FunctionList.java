package functions;

/*
 * Class for FunctionList
 * 
 * 3/7/12
 * I believe this was originally created as an object for an amalgam to keep track of all the 
 * functions that it has access to via its extensions...leaving it around for several more commits
 * to see if there's a practical reason for it.  Either way, it probably doesn't belong here, as this
 * is a folder dedicated to unique functions, not their utils or qualities.
 */

import abstract_types.*;
import java.util.HashMap;

public class FunctionList {
	private HashMap<String, Function> functionList;
	
	public void printFunctions(){
		System.out.println(functionList.keySet());
	}
	
	public String getFunctionDescription(String name){
		return functionList.get(name).toString();
	}
	
}
