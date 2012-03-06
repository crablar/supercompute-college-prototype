package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static_objects.DegradationQueue;
import abstract_types.Function;


public class FunctionTest {

	@Test
	public void testNew(){
		Function f = new Function("f");
		assertEquals(true, f != null);
	}
	
	@Test
	public void testGetName(){
		Function f = new Function("f");
		assertEquals("f", f.getName());
	}
	
	@Test
	public void testToString(){
		assertEquals(false, true);
	}
	
	@Test
	public void testToStringVerbose(){
		assertEquals(false, true);
	}
	
}
