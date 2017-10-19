package my.library.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import my.library.CircularBuffer;
import my.library.RectangularBuffer;

class RectangularBufferTest {

	@Test
	void testToString() {
		RectangularBuffer buf = new RectangularBuffer();		
		assertNotNull(buf, "Rectangular buffer created");

		String str = buf.toString();
		System.out.println(str);
	}

	@Test
	void testSize() {
		RectangularBuffer buf = new RectangularBuffer();		
		
		//Note: it is possible to assign to a variable of the ancestor type
		// an object of the derived type.
		// a RectangularBuffer is also a CircularBuffer
		CircularBuffer buf2 = new RectangularBuffer();		
		
		int nb = CircularBuffer.instances();
		assertEquals(6, nb, "Correct number of instances");
		
		System.out.println(buf2.toString());
		
		// The following line is forbidden by design
		// System.out.println(buf2.super.toString());

	}

}
