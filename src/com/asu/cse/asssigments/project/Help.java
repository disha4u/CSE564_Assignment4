package com.asu.cse.asssigments.project;


import javax.swing.JFrame;
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
public class Help extends JFrame {
	Help() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel(
				"<html><br /> Harshit Viren Shah: hshah78@asu.edu<br/>Janaki Venkata Ramchandra Sai: jnayani@asu.edu<br />Disha Agrawal: dagarw24@asu.edu <br /> Vinaykumar Chalamalla: vchalama@asu.edu <br /> Chandana Gollapudi: cgollapu@asu.edu <br /> Karthikeya Sai Boggarapu: kboggara@asu.edu </html>");
		
		panel.add(label);
		add(panel);
	}
}
