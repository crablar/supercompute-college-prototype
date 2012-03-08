package static_objects;

import java.util.HashMap;

import constructions.*;
import functions.*;
import abstract_types.Function;

/*
 * Class for Degradation Queue
 * 
 * At the beginning of each turn, the object at the front of the queue is degraded.
 */

public final class FunctionHash {
	
	//This must be updated every time I add a function to fill map.
	private final int NUM_FUNCTIONS_IN_MAP = 2;	
	private static final HashMap<String, Function> map = new HashMap<String, Function>();
	
	public static Function getFunction(String name){
		return map.get(name);
	}
	
	//must be a better way
	public static void fillMap(){
		map.put("Lactiferous Antennae", new LactiferousAntennaeConstruction());
		map.put("Subtraction", new Subtraction());
		//remember to update NUM_FUNCTIONS_IN_MAP
	}
}
