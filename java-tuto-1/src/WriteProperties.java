

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {
  public static void main(String[] args) {

	Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("tmp//config.properties");

		// set the properties value
		prop.setProperty("db.name", "localhost");
		prop.setProperty("db.user", "mkyong");
		prop.setProperty("db.password", "password");

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
  }
}