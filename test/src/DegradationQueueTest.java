package src;

import static org.junit.Assert.*;

import org.junit.Test;

import abstract_types.Function;

public class DegradationQueueTest {

	@Test
	public void testDegradeFrontSimple() {
		Function f = new Function("dummy");
		assertEquals(f, null);
	}
	
	@Test
	public void testDegradeFrontSimple2() {
		Function f = new Function("Hey");
		assertEquals("Hey", f.toString());
	}
	
	
	
}
