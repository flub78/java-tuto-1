/**
 * A not so circular buffer
 */
package my.library;

/**
 * Just to play with inheritance
 * 
 * @author fpeignot
 *
 */
public final class RectangularBuffer extends CircularBuffer {

	private int corners = 0;
	
	public RectangularBuffer() throws Exception {
		super();
		corners = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " RectangularBuffer [capacity()=" + capacity + ", size()=" + size() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", corners = " + corners +"]";
	}

}
