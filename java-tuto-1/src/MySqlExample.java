import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Access to a MySql database
 * 
 * the program expect a MySql server
 *   - running on local host
 *   - db name = test
 *   - db user = test_user
 *   - db password = test_password
 *   
 *   one table name books
 * 
 * @author fpeignot
 *
 */

public class MySqlExample {

	public static void main(String[] args) {
		System.out.println("MySql Example");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver O.K.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		String url = "jdbc:mysql://localhost:3306/test";
		String utilisateur = "test_user";
		String motDePasse = "test_password";

		
		try {
			java.sql.Connection connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		    System.out.println("DB connected.");

		    Statement statement = connexion.createStatement();
		    
		    ResultSet resultat = statement.executeQuery( "SELECT * FROM books;" );
		    
		    /* Récupération des données du résultat de la requête de lecture */

		    while ( resultat.next() ) {
		        int id = resultat.getInt( "id" );
		        String title = resultat.getString( "title" );
		        String author = resultat.getString( "author" );
		        Date date = resultat.getDate("date");

		        /* Traiter ici les valeurs récupérées. */
		        System.out.println("id=" + id + ", title="  + title + ", author=" + author + ", date=" + date);
		    }
		    connexion.close();
		    System.out.println("DB closed.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Bye.");
	}

}
