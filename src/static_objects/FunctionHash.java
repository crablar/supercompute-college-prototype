package static_objects;

import java.util.HashMap;

import constructions.*;
import abstract_types.Function;

/*
 * Class for Degradation Queue
 * 
 * At the beginning of each turn, the object at the front of the queue is degraded.
 */

public final class FunctionHash {
	private static HashMap<String, Function> map;
	
	public static Function getFunction(String name){
		return map.get(name);
	}
	
	//must be a better way
	public static void fillMap(){
		map.put("Lactiferous Antennae", new LactiferousAntennaeConstruction());
	}
}
