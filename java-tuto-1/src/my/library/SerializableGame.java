/**
 * An example of serializable object
 */
package my.library;

import java.io.Serializable;

/**
 * @author fpeignot
 *
 */
public class SerializableGame implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 7865878662166827941L;
	private String nom, style;
	private double prix;

	public SerializableGame(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
	}

	public String toString() {
		return "Nom du jeu : " + this.nom + "\n" + "Style de jeu : " + this.style + "\n" + "Prix du jeu : " + this.prix
				+ "\n";
	}

}
