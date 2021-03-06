package VogellaExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyClassTest {


	    @Test
	    public  void  multiplicationOfZeroIntegersShouldReturnZero() {
	        MyClass tester = new MyClass(); // MyClass is tested

	        // assert statements
	        assertEquals("10 x 0 must be 0", 1, tester.multiply(10, 0));
	        assertEquals("0 x 10 must be 0", 1, tester.multiply(0, 10));
	        assertEquals("0 x 0 must be 0", 1, tester.multiply(0, 0));
	    }
	}

