package constructions;

import abstract_types.*;


/*
 * Technical outline:
 * 
 * Lactiferous Antennae--ee
 * 1/4
 * Extraction: gg
 * s: Opponent plays with a random function from his function bag exposed.
 * v: When Lactiferous Antennae is instantiated, your opponent exposes a random function from his function bag.  
 * It remains exposed until it leaves his function bag.  If that function leaves his function bag, your opponent
 * exposes a different function from his function bag at random.
 * 
 * Creative outline:
 * 
 * A comparatively small pair or trio of antennae that are capable of biologically detecting
 * a small amount of indiscriminate information.  They have weak, but not minimal offensive capability.
 * They lactate significantly, making them valued primarily as a resource piece.
 */

public class LactiferousAntennaeConstruction extends Construction {
	
	
	// -------------------------------
    // LactiferousAntennaeConstruction
    // -------------------------------
	
	/*
	 * Initializes a construction for a Lactiferous Antennae
	 */
	public LactiferousAntennaeConstruction(){
		name = "LactiferousAntennaeConstruction";
		simpleDescription = "Lactiferous Antennae--ee\n1/4\nExtraction: gg\nOpponent plays with a random function from his function bag exposed.";
		verboseDescription = "Lactiferous Antennae--ee\n1/4\nExtraction: gg\n When Lactiferous Antennae is instantiated, your opponent exposes a random function from his function bag. It remains exposed until it leaves his function bag.  If that function leaves his function bag, your opponent exposes a different function from his function bag at random."; 
		
	}
	
}
