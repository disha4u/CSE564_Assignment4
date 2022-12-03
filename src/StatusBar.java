


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class StatusBar extends JPanel {

	Storage storage = Storage.getInstance();
	JLabel label;
	String txt = "STATUS: ";

	StatusBar() {

		label = new JLabel();
		add(label);
		setBackground(Color.WHITE);
	}

	public void settext(String s) {
		label.setText(txt + s);
	}

}
