package com.asu.cse.asssigments.project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Help extends JFrame{
	Help(){
		JPanel panel = new JPanel();
		JLabel label = new JLabel("<html>Harshit Viren Shah: hshah78@asu.edu<br/>Janaki Venkata Ramchandra Sai: jnayani@asu.edu<br />Disha Agrawal: dagarw24@asu.edu</html>");
        panel.add(label);
        add(panel);
	}
}
