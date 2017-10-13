/**
 * 
 */
package my_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	 * Test method for {@link my_package.CircularBuffer#CircularBuffer(int)}.
	 */
	@Test
	void testCircularBuffer() {
		CircularBuffer buf = new CircularBuffer(5);
		
		assertNotNull(buf, "Circular buffer created");
	}

	/**
	 * Test method for {@link my_package.CircularBuffer#capacity()}.
	 */
	@Test
	void testCapacity() {
		
		CircularBuffer buf = new CircularBuffer(5);
		assertEquals(buf.capacity(), 5, "correct capacity");
	}

	/**
	 * Test method for {@link my_package.CircularBuffer#push()}.
	 */
	@Test
	void testPush() {
		
		CircularBuffer buf = new CircularBuffer(5);
		assertEquals(buf.size(), 0, "correct size");
		buf.push(1);
		assertEquals(buf.size(), 1, "correct size after push");
		
		System.out.println(buf);
	}

}
