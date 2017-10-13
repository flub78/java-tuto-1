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
	 * Test method for {@link my_package.CircularBuffer#size()}.
	 */
	@Test
	void testSize() {
		
		CircularBuffer buf = new CircularBuffer(5);

		assertEquals(buf.size(), 5, "correct size");
	}

}
