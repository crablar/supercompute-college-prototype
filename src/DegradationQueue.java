import java.utils.ArrayList;

/*
 * Class for Degradation Queue
 * 
 * At the beginning of each turn, the function at the front of the queue is degraded.
 */

public class DegradationQueue {

	private ArrayList<Function> dq;
	
	public DegradationQueue initializeDegradationQueue(){
		dq = new ArrayList<Function>();
	}
	
	public void degradeFront(){
		dq.remove(dq.size() - 1);
	}
	
}
