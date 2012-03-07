package static_objects;

import java.util.ArrayList;
import java.util.HashMap;

import abstract_types.Function;
import abstract_types.Semaphore;

public class Player {
	
	String name;
	private int faultTolerance;
	private FunctionBag functionBag;
	private FunctionLibrary functionLibrary;
	private DegradationQueue degradationQueue;
	private ArrayList<Semaphore> semaphores;
	
	public Player(String name){
		this.name = name;
		this.faultTolerance = 100;
		this.functionBag = new FunctionBag();
		this.functionLibrary = new FunctionLibrary();
		this.degradationQueue = new DegradationQueue();
		this.semaphores = new ArrayList<Semaphore>();
		semaphores.add(new Semaphore('g'));
		semaphores.add(new Semaphore('b'));
		semaphores.add(new Semaphore('e'));
	}
	
	public String listFunctionBag(){
		return functionBag.toString();	
	}
	
}
