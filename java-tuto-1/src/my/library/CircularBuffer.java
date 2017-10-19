/**
 * 
 */
package my.library;

/**
 * An object to handle circular buffers containing integers.
 * 
 * @author fpeignot
 *
 */
public class CircularBuffer {

	// attributes or instance variables
	// choice between
	// private access by the class, bot not derived classes
	// protected, access by the class and subclasses
	// no modifier, access by the class and subclasses in the same package
	// public, access by all
	protected int capacity;
	private int buffer [];
	private int offset = 0;
	private int pushs = 0;
	
	private static int instances = 0;
	
	/**
	 * Constructor
	 * @param size
	 */
	public CircularBuffer(int size) {
		capacity = size;
		buffer = new int[capacity];
		instances++;
	}

	/**
	 * A constructor with a default size
	 * @param size
	 */
	public CircularBuffer() {
		// calling another constructor
		this(5);
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
	 * 
	 * @return the number of Circular Buffers in the program
	 */
	static public int instances() {
		return instances;
	}

	/**
	 * Add several elts	
	 * @param elts 
	 */
	public void push(int elts []) {
		for (int elt : elts) {
			this.push(elt);
		}
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
		String str = "CircularBuffer = [";
		int idx = (offset - this.size() + capacity) % capacity;
		for (int i = 0; i < this.size(); i++) {
			str += buffer[idx];
			idx = (idx + 1) % capacity;
			if (i < this.size() - 1)
				str += ", ";
		}
		str += "]";
		return str;
	}
	
	
	
}
