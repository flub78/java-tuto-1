import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Access to a MySql database
 * 
 * the program expect a MySql server - running on local host - db name = test -
 * db user = test_user - db password = test_password
 * 
 * one table name books
 * 
 * The driver can be found here https://dev.mysql.com/downloads/file/?id=472651
 * 
 * @author fpeignot
 *
 */

public class MySqlTest {

	@Test
	void testBasicSQL() {
		System.out.println("MySql Example");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver O.K.");
			assertTrue(true, "Driver O.K");
		} catch (ClassNotFoundException e) {
			assertTrue(false, "Driver O.K");
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/test";
		String utilisateur = "test_user";
		String motDePasse = "test_password";

		java.sql.Connection connexion = null;
		String step = "";
		String tableName = "books";
		String sql = "";

		try {
			// Connect
			step = "DB connected";
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

			assertNotNull(connexion, step);

		} catch (SQLException e) {
			assertTrue(false, step);
			System.out.println("Error while: " + step);
			System.out.println("Check database=" + url + ", user=" + utilisateur + ", password=" + motDePasse);

			e.printStackTrace();
		}

		try {
			Statement stmt = connexion.createStatement();
			
			if (! tableExists(connexion, tableName)) {
				System.out.println("table \"" + tableName + "\" does not exists.");
				
				// create the table
				step = "Creating table " + tableName;
				sql = "CREATE TABLE IF NOT EXISTS `books` (\n" + 
					  "  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Book id',\n" + 
					  "  `title` varchar(255) NOT NULL COMMENT 'Title',\n" + 
					  "  `author` varchar(255) DEFAULT NULL COMMENT 'Author',\n" + 
					  "  `date` date DEFAULT NULL COMMENT 'Date',\n" + 
					  "  PRIMARY KEY (`id`)\n" + 
					  ") ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;\n";
				
				stmt.executeUpdate(sql);
			}
				
		} catch (SQLException e) {
			System.out.println(step);
			e.printStackTrace();
		}
			
		try {

			Statement stmt = connexion.createStatement();

			// fill the database
			int count = count(connexion, tableName);
			System.out.println("books count = " + count);
				
			sql = "INSERT INTO `test`.`books` (`id`, `title`, `author`, `date`) "
			    + "VALUES (NULL, 'Crime and punishment', 'Fiodor Mikhaïlovitch Dostoïevski', '1866-01-01'), "
				+ "(NULL, '1984', 'Orson Wells', '1949-01-01');";
			stmt.executeUpdate(sql);
				
			int newCount = count(connexion, tableName);
			System.out.println("new books count = " + newCount);
		} catch (SQLException e) {
			System.out.println(step);
			e.printStackTrace();
		}

		
		try {
			step = "Execute a query";
			
			Statement stmt = connexion.createStatement();

			ResultSet resultat = stmt.executeQuery("SELECT * FROM books;");

			/* Récupération des données du résultat de la requête de lecture */

			while (resultat.next()) {
				int id = resultat.getInt("id");
				String title = resultat.getString("title");
				String author = resultat.getString("author");
				Date date = resultat.getDate("date");

				/* Traiter ici les valeurs récupérées. */
				System.out.println("id=" + id + ", title=" + title + ", author=" + author + ", date=" + date);
			}
			connexion.close();
			System.out.println("DB closed.");

		}catch(

	SQLException e)
	{
		System.out.println(step);
		e.printStackTrace();
	}

	System.out.println("Bye.");
	}

	/**
	 * Check if a table exists in the database
	 * 
	 * @param con
	 * @param tableName
	 * @return
	 */
	static boolean tableExists(java.sql.Connection con, String tableName) {
		try {
			java.sql.DatabaseMetaData dbm = con.getMetaData();

			ResultSet tables = dbm.getTables(null, null, tableName, null);
			if (tables.next()) {
				// Table exists
				return true;
			} else {
				// Table does not exist
				return false;
			}
		} catch (SQLException e) {
			return false;
		}
	}

	/**
	 * returns the number of element in a database table
	 * 
	 * @param con
	 *            DB connection
	 * @param tableName
	 * @return the number of element
	 */
	static int count(java.sql.Connection con, String tableName) {

		try {
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select count(*) from " + tableName);

			while (res.next()) {
				return res.getInt(1);
			}

		} catch (SQLException e) {
			return 0;
		}

		return 0;
	}
}
