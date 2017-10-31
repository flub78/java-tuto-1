import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Example of access to the file system.
 * 
 * @author Fred
 * 
 */

public class ReadTextFile {

	public static void main(String[] args) {

		String user = System.getProperty("user.name");

		String filename = "C:\\Users\\" + user + "\\git\\java-tuto-1\\java-tuto-1\\README.md";

		cat(filename);
		linenumber(filename);

		System.out.println("Bye.");
	}

	/**
	 * Display a file content
	 * 
	 * @param filename
	 */
	public static void cat(String filename) {
		try {
			String s = readFile(filename, StandardCharsets.UTF_8);
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Display a file content
	 * 
	 * @param filename
	 */
	public static void linenumber(String filename) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(filename));
			
			int n = 0;
			for (String s : lines) {
				System.out.println(n + ": " + s);
				n++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Read a file into a string
	 * @param path
	 * @param encoding
	 * @return
	 * @throws IOException
	 */
	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}
