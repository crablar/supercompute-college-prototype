package static_objects_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static_objects.DegradationQueue;
import static_objects.FunctionHash;
import abstract_types.Function;


public class FunctionLibraryTests {
	
	//Redundant hack; this test is in FunctionHashTests, but allows the map to be initialized
	public void testFunctionHash(){
		FunctionHash.fillMap();
		assertEquals(true, false);
	}
	
	@Test
	public void testFillLibrary(){
		assertEquals(true, false);
	}

}
