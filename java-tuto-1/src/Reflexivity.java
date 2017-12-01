import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world
 * 
 * @author fpeignot
 *
 */

public class Reflexivity {

	public static void main(String[] args) {
		System.out.println("java reflexivity examples");

		Class<String> c = String.class;
		Class<? extends String> c2 = new String().getClass();

		System.out.println("class from class ID = " + c);
		System.out.println("class from object instance = " + c2);

		System.out.println(
				"La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());

		// La méthode getInterfaces retourne un tableau de Class
		Class[] faces = c.getInterfaces();
		// Pour voir le nombre d'interfaces
		System.out.println("\nIl y a " + faces.length + " interfaces implémentées");
		// On parcourt le tableau d'interfaces
		for (int i = 0; i < faces.length; i++)
			System.out.println(faces[i]);

		Method[] m = c.getMethods();

		System.out.println("\nIl y a " + m.length + " méthodes dans cette classe");
		// On parcourt le tableau de méthodes
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);

			Class[] p = m[i].getParameterTypes();
			for (int j = 0; j < p.length; j++)
				System.out.println("\t" + p[j].getName());

		}

		Field[] fld = c.getDeclaredFields();

		System.out.println("\nIl y a " + fld.length + " champs dans cette classe");
		// On parcourt le tableau de méthodes
		for (int i = 0; i < fld.length; i++)
			System.out.println(fld[i].getName());

		System.out.println("\nBye.");
	}

}
