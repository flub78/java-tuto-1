/**
 * Examples on exception
 * @author fpeignot
 *
 */




public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Exception examples");


		try {
			int i = 6;
			System.out.println("fact(" + i + ") =  " +  my.library.MyMath.fact(i));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int i = -1;
			System.out.println("fact(" + i + ") =  " +  my.library.MyMath.fact(i));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			throw new MyException("ERRRROOOOOOOORRRR");
		} catch (MyException e) {
			System.out.println("MyException");

			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Another exception");

			e.printStackTrace();
		} finally {
			System.out.println("Finally");

		}
		
		// what happens when an exception is raised inside a constructor ?
		

	}

	/**
	 * A function to compute the square o fan int
	 * @param i
	 * @return the square value
	 */
	public static int square(int i) {
		return i * i;
	}
}
