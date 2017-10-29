import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
  public static void main(String[] args) {

	Properties prop = new Properties();
	InputStream input = null;

	try {

		input = new FileInputStream("tmp//config.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		System.out.println(prop.getProperty("db.name"));
		System.out.println(prop.getProperty("db.user"));
		System.out.println(prop.getProperty("db.password"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

  }
}