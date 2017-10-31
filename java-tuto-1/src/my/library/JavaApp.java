/**
 * 
 */
package my.library;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
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
		JPanel pan = new JPanel();

		// D�finition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		// On pr�vient notre JFrame que notre JPanel sera son content pane

		this.setContentPane(pan);
		this.setVisible(true);
	}
}
