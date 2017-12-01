import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import my.library.Paire;

/**
 * Hello world
 * 
 * @author fpeignot
 *
 */

public class Reflexivity2 {

	public static void main(String[] args) {
		System.out.println("java reflexivity examples 2");

		String nom = Paire.class.getName();

		try {
			// On cr�e un objet Class
			Class<?> cl = Class.forName(nom);
			
			// Nouvelle instance de la classe Paire
			Object o = cl.newInstance();

			// On cr�e les param�tres du constructeur
			Class[] types = new Class[] { String.class, String.class };
			// On r�cup�re le constructeur avec les deux param�tres
			Constructor<?> ct = cl.getConstructor(types);

			// On instancie l'objet avec le constructeur surcharg� !
			Object o2 = ct.newInstance(new String[] { "valeur 1 ", "valeur 2" });
			
			System.out.println("object o = " + o);
			System.out.println("object o2 = " + o2);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println("\nBye.");
	}

}
