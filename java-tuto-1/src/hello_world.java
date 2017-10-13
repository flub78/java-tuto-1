/**
 * Small hello world
 * @author fpeignot
 *
 * TODO generate javadoc
 */

import java.util.Scanner;
import my_package.MyMath.*;

public class hello_world {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name :");

		String str = sc.nextLine();

		System.out.println("Hello " + str);
		
		System.out.println("enter an integer :");
		int i = sc.nextInt();
		System.out.println(i + " x " + i + " = " +  square(i));
		
		if (i < 0)
			System.out.println(i + " is negative.");
		else {
			System.out.println(i + " is positive.");
		}

		try {
			System.out.println("fact(" + i + ") =  " +  my_package.MyMath.fact(i));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
