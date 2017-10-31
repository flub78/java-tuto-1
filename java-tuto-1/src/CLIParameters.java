/**
 * Display command line parameters
 * 
 * @author fpeignot
 *
 */


public class CLIParameters {

	public static void main(String[] args) {
		System.out.println("Command line parameters :");
		
		int i = 0;
		for (String s : args) {
			System.out.println(i + " : " + s );
			i++;
		}
		System.out.println("Bye.");		
	}

}
