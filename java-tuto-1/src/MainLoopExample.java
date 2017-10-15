/**
 * Some examples on java loops
 * @author fpeignot
 *
 */
public class MainLoopExample {

	public static void main(String[] args) {
		System.out.println("Some examples on java loops.");
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
			if (j >= 5)
				break;
		}
		System.out.println("Bye.");
	}

}
