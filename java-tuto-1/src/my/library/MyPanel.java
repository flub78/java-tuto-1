package my.library;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")

/**
 * A special panel filled with an oval
 * 
 * @author fpeignot
 *
 */
public class MyPanel extends JPanel {

	public void paintComponent(Graphics g) {
		System.out.println("paintComponent");
		g.fillOval(20, 20, 75, 75);
	}
}
