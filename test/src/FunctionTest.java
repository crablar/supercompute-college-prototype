package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static_objects.DegradationQueue;
import abstract_types.Function;


public class FunctionTest {

	@Test
	public void testNew(){
		Function f = new Function();
		assertEquals(true, f != null);
	}
	
	@Test
	public void testGetSimpleDesc(){
		Function f = new Function();
		assertEquals("A blank function.", f.getSimpleDescription());
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
