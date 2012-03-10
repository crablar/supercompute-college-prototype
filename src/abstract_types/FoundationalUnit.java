package abstract_types;

import java.util.Set;

import static_objects.DegradationQueue;

public class FoundationalUnit extends Instance{

	public Set<Character> types;
	
	// ----------------------------
    // FoundationalUnit Constructor
    // ----------------------------
	
	/*
	 * Initializes a basic FoundationalUnit
	 * @param f the function to be degraded
	 * @return a basic FoundationalUnit
	 */
	
	public FoundationalUnit(Function f){
		if(f.getCost().contains("b"))
			types.add(new Character('b'));
		if(f.getCost().contains("e"))
			types.add(new Character('e'));
		DegradationQueue.enqueue(f);
	}
	
}
