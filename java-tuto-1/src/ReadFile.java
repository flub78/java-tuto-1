import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import sun.misc.IOUtils;

/**
 * Example of access to the file system.
 * 
 * @author Fred
 * 
 * TODO access and modification of file criteria
 *
 */

public class ReadFile {

	public static void main(String[] args) {
		
		String user = System.getProperty("user.name");
				
		String filename = "C:\\Users\\" + user + "\\git\\java-tuto-1\\java-tuto-1\\README.md";
		
		cat(filename);
		
		System.out.println("Bye.");
	}
			
	/**
	 * Display a file content
	 * @param filename
	 */
	public static void cat(String filename) {
		
		try(FileInputStream inputStream = new FileInputStream(filename)) {     
		    String everything = IOUtils.toString(inputStream);
		    // do something with everything string
		}
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
