import java.io.File;

/**
 * Example of access to the file system.
 * 
 * @author fpeignot
 *
 */

public class SystemExamples {

	public static void main(String[] args) {
		System.out.println("Example of access to the file system.");

		System.out.println("pwd = " + System.getProperty("user.dir"));
		System.setProperty("user.dir", "C:\\Users\\fpeignot\\git\\java-tuto-1");
		System.out.println("pwd = " + System.getProperty("user.dir"));

		// Does not really works, set the property but does not change the directory
		System.setProperty("user.dir", "..");
		System.out.println("pwd = " + System.getProperty("user.dir"));

		System.setProperty("user.dir", "C:\\Users\\fpeignot\\git");
		System.out.println("pwd = " + System.getProperty("user.dir"));
		

		System.out.println("File.separator = " + File.separator);
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");

		listDir("C:\\\\Users\\\\fpeignot\\\\git", 0, "..");

		System.out.println("Bye.");
	}
		
	/**
	 * function to recurse through a directory content
	 * @param dirname
	 * @param level
	 * @param pattern
	 */
	public static void listDir(String dirname, int level, String pattern) {
		File folder = new File(dirname);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println(tabs(level, pattern) + " " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				String subdir = dirname + File.separator + listOfFiles[i].getName();
				System.out.println(tabs(level, pattern) + subdir);
				listDir(subdir, level + 1, pattern);
			}
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
