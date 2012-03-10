package static_objects;

import java.util.ArrayList;

import abstract_types.Function;

public class FunctionBag {
	
	private int size;
	private ArrayList<Function> functionBag;
	
	public FunctionBag(){
		size = 0;
	}
	
	public void add(Function f){
		functionBag.add(f);
		size++;
	}
	
}
