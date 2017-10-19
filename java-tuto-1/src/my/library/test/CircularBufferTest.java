/**
 * 
 */
package my.library.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import my.library.CircularBuffer;

/**
 * @author fpeignot
 *
 */
class CircularBufferTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link my.library.CircularBuffer#CircularBuffer(int)}.
	 */
	@Test
	void testCircularBuffer() {
		CircularBuffer buf = new CircularBuffer(5);
		
		assertNotNull(buf, "Circular buffer created");
	}

	/**
	 * Test method for {@link my.library.CircularBuffer#capacity()}.
	 */
	@Test
	void testCapacity() {
		
		CircularBuffer buf = new CircularBuffer();
		assertEquals(buf.capacity(), 5, "correct capacity");
	}

	/**
	 * Test method for {@link my.library.CircularBuffer#push()}.
	 */
	@Test
	void testPush() {
		
		CircularBuffer buf = new CircularBuffer(5);
		assertEquals(buf.size(), 0, "correct size");
		buf.push(1);
		int size = buf.size();
		assertEquals(size, 1, "correct size after push");
		
		String expected = "CircularBuffer = [1]";
		assertTrue(buf.toString().equals(expected), expected);
		
		buf.push(2);
		expected = "CircularBuffer = [1, 2]";
		System.out.println(buf);

		assertTrue(buf.toString().equals(expected), expected);
		
		buf.push(new int[] {});
		assertEquals(2, buf.size(), "size not changed by addition of an empty list");
		
		int[] myIntArray = {3,4,5};
		buf.push(myIntArray);
		assertEquals(5, buf.size(), "size changed by addition of a non empty list");

		buf.push(new int[] {6,7,8});
		
		System.out.println(buf);
	}

	/**
	 * Test method for {@link my.library.CircularBuffer#instances()}.
	 */
	@Test
	void testInstances() {
		
		CircularBuffer buf = new CircularBuffer();
		assertEquals(buf.capacity(), 5, "correct capacity (default)");
		
		int nb = CircularBuffer.instances();
		assertEquals(3, nb, "Correct number of instances");
	}

}
