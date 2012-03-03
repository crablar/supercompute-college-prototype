import java.util.ArrayList;

/*
 * Class for Degradation Queue
 * 
 * At the beginning of each turn, the function at the front of the queue is degraded.
 */

public class DegradationQueue {

	private static final ArrayList<Function> dq = new ArrayList<Function>();
	
	//Degrade and return the front function
	public Function degradeFront(){
		Function degraded = dq.get(dq.size() - 1);
		dq.remove(dq.size() - 1);
		return degraded;
	}
	
}
