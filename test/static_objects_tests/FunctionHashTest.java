package static_objects_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import functions.*;
import abstract_types.Function;
import static_objects.FunctionHash;


public class FunctionHashTest {
	
	@Test
	public void testFunctionHash(){
		assertNull(FunctionHash.getFunction("Subtraction"));
		FunctionHash.fillMap();
		Subtraction sub = (Subtraction) FunctionHash.getFunction("Subtraction");
		assertNotNull(sub);
		assertEquals(sub.getName(), FunctionHash.getFunction("Subtraction").getName());
	}
}
