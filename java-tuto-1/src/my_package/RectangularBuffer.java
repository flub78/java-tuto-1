/**
 * A not so circular buffer
 */
package my_package;

/**
 * @author fpeignot
 *
 */
public class RectangularBuffer extends CircularBuffer {

	@Override
	public String toString() {
		return "RectangularBuffer [capacity()=" + capacity() + ", size()=" + size() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
