/**
 * 
 */
package my_package;

/**
 * An object to handle circular buffers.
 * 
 * @author fpeignot
 *
 */
public class CircularBuffer {

	private int capacity;
	
	/**
	 * Constructor
	 * @param size
	 */
	public CircularBuffer(int size) {
		capacity = size;
	}
	
	/**
	 * 
	 * @return the maximal size of the circular buffer
	 */
	public int size() {
		return this.capacity;
	}
}
