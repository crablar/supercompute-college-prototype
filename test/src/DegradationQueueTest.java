package src;

import static org.junit.Assert.*;
import

org.junit.Test;

import static_objects.DegradationQueue;
import abstract_types.Function;

public class DegradationQueueTest {

	@Test
	public void testDegradeAll(){
		Function f = new Function("f");
		DegradationQueue.enqueue(f);
		DegradationQueue.enqueue(f);
		DegradationQueue.enqueue(f);
		DegradationQueue.degradeAll();
		assertEquals(true, DegradationQueue.empty());
	}
	
	@Test
	public void testToString() {
		Function f = new Function("f");
		DegradationQueue.enqueue(f);
		assertEquals("f", DegradationQueue.getString());
	}
	
	@Test
	public void testToStringEmpty() {
		assertEquals("", DegradationQueue.getString());
	}
	
	@Test
	public void testDegradeFrontSimple() {
		assertEquals(true, DegradationQueue.empty());
		Function f = new Function("f");
		DegradationQueue.enqueue(f);
		assertEquals(DegradationQueue.size(), 1);
		DegradationQueue.degradeFront();
		assertEquals(true, DegradationQueue.empty());
	}
	
	public void testSize(){}
	
	public void testDegradeFrontEmpty(){}
	
	public void testDegradeFrontEmptyTwice(){}
		
	public void testEnqueueEmpty(){}

	public void testEnqueueOneItem(){}
	
	public void testEnqueueTwoItems(){}
	
	public void testEnqueueTenItems(){}
	
	

	

	
	
}
