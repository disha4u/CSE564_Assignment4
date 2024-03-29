import java.util.*;
import java.util.List;
import java.util.Queue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class draws the relationship on the screen
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class DrawRelationship {
	/**
	 * Method to show various options for relationship and draw the relationship
	 */
	public void draw() {

		JPanel panel = new JPanel(new GridLayout(0, 1));

		JRadioButton button1 = new JRadioButton("Association");
		button1.setHorizontalTextPosition(SwingConstants.RIGHT);
		JRadioButton button2 = new JRadioButton("Inheritance");
		button2.setHorizontalTextPosition(SwingConstants.RIGHT);
		JRadioButton button3 = new JRadioButton("Composition");
		button3.setHorizontalTextPosition(SwingConstants.RIGHT);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		Controller controller = new Controller();
		button1.addActionListener(controller);
		button2.addActionListener(controller);
		button3.addActionListener(controller);

		JOptionPane.showMessageDialog(null, panel);

	}

}
