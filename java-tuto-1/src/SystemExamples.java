import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Example of access to the file system.
 * 
 * @author Fred
 * 
 * TODO access and modification of file criteria
 *
 */

public class SystemExamples {

	public static void main(String[] args) {
		
		String user = System.getProperty("user.name");
		
		System.out.println("Example of access to the file system.");

		System.out.println("user.name = " + user);

		System.out.println("pwd = " + System.getProperty("user.dir"));
		System.setProperty("user.dir", "C:\\Users\\" + user + "\\git\\java-tuto-1");
		System.out.println("pwd = " + System.getProperty("user.dir"));

		// Does not really works, set the property but does not change the directory
		System.setProperty("user.dir", "..");
		System.out.println("pwd = " + System.getProperty("user.dir"));

		System.setProperty("user.dir", "C:\\Users\\" + user + "\\git");
		System.out.println("pwd = " + System.getProperty("user.dir"));
		

		System.out.println("File.separator = " + File.separator);
		System.out.println("...");

		listDir("C:\\\\Users\\\\" + user + "\\\\git\\java-tuto-1\\java-tuto-1\\src", 0, "..");

		String filename = "C:\\Users\\" + user + "\\git\\java-tuto-1\\java-tuto-1\\README.md";
		
		listAttributes(filename, 0, "  ");

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
	 * function to recurse through a directory content
	 * @param dirname
	 * @param level
	 * @param pattern
	 */
	public static void listAttributes(String filename, int level, String pattern) {
		File f = new File(filename);
		
		System.out.println(tabs(level, pattern) + filename);

		level++;
		System.out.println(tabs(level, pattern) + "exists() : " + f.exists());		
		System.out.println(tabs(level, pattern) + "getAbsolutePath() : " + f.getAbsolutePath());		
		System.out.println(tabs(level, pattern) + "getName() : " + f.getName());		
		System.out.println(tabs(level, pattern) + "isDirectory() : " + f.isDirectory());		
		System.out.println(tabs(level, pattern) + "length() : " + f.length());		
		System.out.println(tabs(level, pattern) + "lastModified() : " + f.lastModified());		
		System.out.println(tabs(level, pattern) + "canRead() : " + f.canRead());		
		System.out.println(tabs(level, pattern) + "canWrite() : " + f.canWrite());		
		System.out.println(tabs(level, pattern) + "canExecute() : " + f.canExecute());
		
		Path p = f.toPath();
		try {
			BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);
			
			System.out.println("creationTime: " + attr.creationTime());   // type FileTime
			System.out.println("lastAccessTime: " + attr.lastAccessTime());
			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// To modify attributes we need to interdace Window sAPI with JNI
		// https://stackoverflow.com/questions/32586/how-to-discover-a-files-creation-time-with-java
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
