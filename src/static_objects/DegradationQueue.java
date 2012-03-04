package static_objects;

import abstract_types.*;
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
	
	public void enqueue(Function f){
		dq.add(f);
	}
	
	//future implementation should use IO with some higher level class that does the printing
	public void print(){
		System.out.println(dq.toString());
	}
	
	
	
}
