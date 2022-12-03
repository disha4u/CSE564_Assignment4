package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel {
	
	Storage storage = Storage.getInstance();
	JLabel label;
	String txt="STATUS: ";
	StatusBar()
	{

		label = new JLabel();
		add(label);
		setBackground(Color.WHITE);
	}
	
	public void settext(String s) {
		label.setText(txt+s);
	}
	
//	@Override
//	public void Update(Observable o) {
//		// TODO Auto-generated method stub
//		int index = storage.getclasssize();
//		
//	}

}
