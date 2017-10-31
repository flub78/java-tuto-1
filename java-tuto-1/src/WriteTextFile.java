import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Write a text file
 * 
 * @author Fred
 * 
 */

public class WriteTextFile {

	public static void main(String[] args) {

		String user = System.getProperty("user.name");
		String filename = "C:\\Users\\" + user + "\\git\\java-tuto-1\\java-tuto-1\\tmp\\log.txt";

		File file=new File(filename);
		DataOutputStream outstream;
		try {
			// false to overwrite, true to append
			outstream = new DataOutputStream(new FileOutputStream(file,false));
			String body = "new content\n";
			outstream.write(body.getBytes());
			
			outstream.write("Line 3\n".getBytes());
			outstream.write("Line 3\n".getBytes());
			outstream.close(); 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Bye.");
	}

	

}
