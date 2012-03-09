// -----------------
// FunctionTest.java
// -----------------

/*
 * Tests the abstract class function.
 */

package abstract_types_tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import functions.Subtraction;

import static_objects.DegradationQueue;
import abstract_types.Function;

public class FunctionTest {

	private final String name = "Subtraction";
	private final String sd = "Disrupt target amalgam or player for 10.";
	private final String vd = "Disrupt target amalgam or player for 10.";
	
	@Test
	public void testNew(){
		Subtraction s = new Subtraction();
		assertNotNull(s);
	}
	
	@Test
	public void testNameAndDescriptions(){
		Subtraction s = new Subtraction();
		assertEquals(name, s.getName());
		assertEquals(sd, s.getSimpleDescription());
		assertEquals(vd, s.getVerboseDescription());
	}
	
	@Test
	public void testToString(){
		Subtraction s = new Subtraction();
		assertEquals(name, s.getName());
	}
	
	@Test
	public void testToStringVerbose(){
		Subtraction s = new Subtraction();
		assertEquals(vd, s.getVerboseDescription());
	}
	
}
