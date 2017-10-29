import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import sun.misc.IOUtils;

/**
 * Storing and retrieving objects from a file
 * 
 * @author Fred
 *
 */

public class ObjectFile {

	public static void main(String[] args) {
		
		String user = System.getProperty("user.name");
				
		String filename = "C:\\Users\\" + user + "\\git\\java-tuto-1\\java-tuto-1\\tmp\\Objects.file";
				
		System.out.println("Bye.");
	}
			

	/**
	 * returns a string made of several times the same pattern
	 * @param nb
	 * @param pattern
	 * @return
	 */
	public static String tabs(int nb, String pattern) {
		String res = "";
		for (int i = 0; i < nb; i++) {
			res += pattern;
		}
		return res;
	}

}
