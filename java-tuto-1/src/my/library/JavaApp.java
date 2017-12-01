/**
 * 
 */
package my.library;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A class derived from JFrame as ancestor of a GUI java application
 * Set some defaults.
 * 
 * @author fpeignot
 *
 */
public class JavaApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JavaApp(String title) {
		this.setTitle(title);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instanciation d'un objet JPanel
		JPanel pan = new MyPanel();
		// JPanel pan = new JPanel();

		// Définition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		// On prévient notre JFrame que notre JPanel sera son content pane

		this.setContentPane(pan);
		this.setVisible(true);
	}
}
