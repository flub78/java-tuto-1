package my.library.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import my.library.MyMath;

class MyMathTest extends MyMath {

	@Test
	void testFact() {
		// fail("Not yet implemented");
		try {
			assertEquals(120, fact(5));
		} catch (Exception e) {
			fail("Exception raised on fact(5)");
			e.printStackTrace();
		}
		
		try {
			assertEquals(0, fact(-1));
			fail("Exception not raised on fact(-1)");
		} catch (Exception e) {
			assertTrue(true, "Expected exception caught on fact(-1)");
			
		}

	}

}
