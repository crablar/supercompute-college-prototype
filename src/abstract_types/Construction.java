package abstract_types;

/*
 * Class for Construction
 * 
 */

public abstract class Construction extends Function{
	
	public Construction() {
		super();
	}

	//null in the case of a construction that does not initialize an extension
	private Amalgam extensionTarget;

}
