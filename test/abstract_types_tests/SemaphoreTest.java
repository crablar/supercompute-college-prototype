package abstract_types_tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import abstract_types.*;


public class SemaphoreTest {

	@Test
	public void testNew(){
		Semaphore s = new Semaphore(new Character('g'));
		assertEquals(true, s != null);
	}
	
	@Test
	public void testIncrementOne(){
		Semaphore s = new Semaphore(new Character('g'));
		s.increment();
		assertEquals(1, s.getAmount());
	}
	
	@Test
	public void testIncrementAmt(){
		Semaphore s = new Semaphore(new Character('g'));
		s.increment(5);
		assertEquals(5, s.getAmount());
	}
	
	@Test
	public void testDecrementOne(){
		Semaphore s = new Semaphore(new Character('g'));
		s.increment();
		assertEquals(1, s.getAmount());
		s.decrement();
		assertEquals(0, s.getAmount());
	}
	
	@Test
	public void testDecrementAmt(){
		Semaphore s = new Semaphore(new Character('g'));
		s.increment(5);
		s.decrement(3);
		assertEquals(2, s.getAmount());
	}
	
	@Test
	public void testDecrementUnderflow(){
		Semaphore s = new Semaphore(new Character('g'));
		try{
			s.decrement(3);
		}
		catch(RuntimeException r){
			assertEquals(r.getMessage(), "Semaphore underflow!");
		}
		assertEquals(0, s.getAmount());
	}
	
	@Test
	public void testGetType(){
		Semaphore s = new Semaphore(new Character('g'));
		assertEquals(new Character('g'), s.getType());
	}
	
}
