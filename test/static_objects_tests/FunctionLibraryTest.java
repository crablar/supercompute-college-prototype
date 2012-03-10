package static_objects_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import functions.Subtraction;

import static_objects.DegradationQueue;
import static_objects.FunctionHash;
import static_objects.Player;
import abstract_types.Function;


public class FunctionLibraryTest {
	
	@Test
	public void testFillLibrary(){
		FunctionHash.fillMap();
		Player p = new Player("Jeff");
		try {
			p.getFunctionLibrary().createLibrary(new File("src/test_lib_list.txt"));
		} catch (FileNotFoundException e) {
			assertEquals(false, true);
		}
	}
}
