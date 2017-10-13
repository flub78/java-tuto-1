/**
 * A minimal command interpretor
 * @author fpeignot
 *
 */
import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, version 1. (type quit to stop, help for help)");
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String str;
		while (i < 10) {
			System.out.print(i + "> ");
			str = sc.nextLine();
			System.out.println(str);
			i++;
			if (str.equals("quit")) 
				break;
			else if (str.equals("help"))
				help();
		}
		sc.close();
		System.out.println("\nBye.");
	}
	
	private static void help () {
		System.out.println("Hello, version 1)");
		System.out.println("quit\tstop");
		System.out.println("help\tdisplay this page");
		
	}

}
