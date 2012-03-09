package static_objects_tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class suite_static_objects {

	private final static Class[] static_object_tests = {
		DegradationQueueTest.class, 
		FunctionHashTest.class, 
		FunctionLibraryTest.class
	};
	
	public static Test suite() {
		TestSuite suite = new TestSuite(static_object_tests);
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
