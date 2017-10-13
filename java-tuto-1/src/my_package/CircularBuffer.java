/**
 * 
 */
package my_package;

import java.util.Arrays;

/**
 * An object to handle circular buffers.
 * 
 * @author fpeignot
 *
 */
public class CircularBuffer {

	private int capacity;
	private int buffer [];
	private int offset = 0;
	private int pushs = 0;
	
	/**
	 * Constructor
	 * @param size
	 */
	public CircularBuffer(int size) {
		capacity = size;
		buffer = new int[capacity];
	}
	
	/**
	 * 
	 * @return the maximal size of the circular buffer
	 */
	public int capacity() {
		return this.capacity;
	}

	/**
	 * 
	 * @return the used size
	 */
	public int size() {
		if (pushs > capacity)
			return capacity;
		else
			return pushs;
	}

	/**
	 * Add a new element
	 * @param elt
	 */
	public void push(int elt) {
		buffer[offset] = elt;
		offset++;
		offset %= capacity;
		pushs++;
	}

	@Override
	public String toString() {
		return "CircularBuffer [=" + Arrays.toString(buffer) + "]";
	}
	
	
	
}
