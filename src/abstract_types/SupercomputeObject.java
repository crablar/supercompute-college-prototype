package abstract_types;

/*
 * Class for a Supercompute Object
 * 
 * Every class in Supercompute inherits from SupercomputeObject
 */

public class SupercomputeObject {
	protected String name;
	protected String simpleDescription;
	protected String verboseDescription;
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return simpleDescription;
	}

	public String getSimpleDescription(){
		return simpleDescription;
	}
	
	public String getVerboseDescription(){
		return verboseDescription;
	}
	
	
}
