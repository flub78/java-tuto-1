/**
 * Exmaple of package
 */
package my_package;

/**
 * small example of a class called from an application
 * 
 * @author fpeignot
 *
 */
public class MyMath {

	/**
	 * compute a factorial
	 * @param i
	 * @return
	 * @throws Exception 
	 */
	public static int fact(int i) throws Exception {
		if (i < 0)
			throw new Exception("fact paramater should not be negative");
		
		if (i == 0)
			return 1;
		else
			return i * fact(i - 1);
	}
		
}
