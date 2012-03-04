package static_objects;

import abstract_types.*;
import java.util.ArrayList;

/*
 * Class for Degradation Queue
 * 
 * At the beginning of each turn, the function at the front of the queue is degraded.
 */

public final class DegradationQueue {

	private static final ArrayList<Function> dq = new ArrayList<Function>();
	
	//Degrade and return the front function
	public static Function degradeFront(){
		Function degraded = dq.get(dq.size() - 1);
		dq.remove(dq.size() - 1);
		return degraded;
	}
	
	public static void degrade(int index) {
		// TODO Auto-generated method stub
		
	}
	
	public static void enqueue(Function f){
		dq.add(f);
	}
	
	//future implementation should use IO with some higher level class that does the printing
	public static void print(){
		System.out.println(dq.toString());
	}
	
	public String toString(){
		return dq.toString();
	}

	public static int size() {
		return dq.size();
	}

	public static boolean empty() {
		return dq.size() == 0;
	}

	
	
	
}
