package abstract_types;

/*
 * Class for Construction
 * 
 */

public abstract class Construction extends Function{
	
	//null in the case of a construction that does not initialize an extension
	private Amalgam extensionTarget;
	
	public Construction() {
		simpleDescription = "A blank construction.";
		name = "A blank construction.";
		verboseDescription = "A blank construction.";
	}



}
