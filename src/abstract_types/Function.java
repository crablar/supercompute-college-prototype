package abstract_types;

import java.util.Set;

/*
 * Class for Function
 */

public abstract class Function extends SupercomputeObject{
	
	protected String cost;
	protected boolean isExecuting;

	public String getCost() {
		return cost;		
	}
	
	public boolean executing(){
		return isExecuting;
	}
	
}
