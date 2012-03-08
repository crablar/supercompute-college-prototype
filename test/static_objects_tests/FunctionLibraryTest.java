package static_objects_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import functions.Subtraction;

import static_objects.DegradationQueue;
import static_objects.FunctionHash;
import abstract_types.Function;


public class FunctionLibraryTest {
	
	//Redundant hack; this test is in FunctionHashTests, but allows the map to be initialized
	@Test
	public void testFunctionHash(){
		assertNull(FunctionHash.getFunction("Subtraction"));
		FunctionHash.fillMap();
		Subtraction sub = (Subtraction) FunctionHash.getFunction("Subtraction");
		assertNotNull(sub);
		assertEquals(sub.getName(), FunctionHash.getFunction("Subtraction").getName());
	}
	
	@Test
	public void testFillLibrary(){
		assertEquals(true, false);
	}

}
