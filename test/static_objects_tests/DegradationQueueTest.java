package static_objects_tests;

import static org.junit.Assert.*;

import

org.junit.Test;

import static_objects.DegradationQueue;
import abstract_types.Function;

public class DegradationQueueTest {

	@Test
	public void testDegradeAll(){
		Function f1 = new Function();
		Function f2 = new Function();
		Function f3 = new Function();
		DegradationQueue.enqueue(f1);
		DegradationQueue.enqueue(f2);
		DegradationQueue.enqueue(f3);
		DegradationQueue.degradeAll();
		assertEquals(true, DegradationQueue.empty());
	}
	
	@Test
	public void testToString() {
		Function f = new Function();
		DegradationQueue.enqueue(f);
		assertEquals("{ f }", DegradationQueue.getString());
	}
	
	@Test
	public void testToStringEmpty() {
		assertEquals("", DegradationQueue.getString());
	}
	
	@Test
	public void testDegradeFrontSimple() {
		assertEquals(true, DegradationQueue.empty());
		Function f = new Function();
		DegradationQueue.enqueue(f);
		assertEquals(DegradationQueue.size(), 1);
		DegradationQueue.degradeFront();
		assertEquals(true, DegradationQueue.empty());
	}
	
	@Test
	public void testSize(){
		assertEquals(false, true);
	}
	
	@Test
	public void testDegradeFrontEmpty(){
		assertEquals(false, true);
	}
	
	@Test
	public void testDegradeFrontEmptyTwice(){
		assertEquals(false, true);
	}
		
	@Test
	public void testEnqueueEmpty(){
		assertEquals(false, true);
	}

	@Test
	public void testEnqueueOneItem(){
		assertEquals(false, true);
	}
	
	@Test
	public void testEnqueueTwoItems(){
		assertEquals(false, true);
	}
	
	@Test
	public void testEnqueueTenItems(){
		assertEquals(false, true);
	}

}
