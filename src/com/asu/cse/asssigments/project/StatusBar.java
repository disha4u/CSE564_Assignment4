package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel implements Observer {
	
	Storage storage = Storage.getInstance();
	JLabel label;
	StatusBar()
	{
//		setSize(new Dimension(400, 400));
		label = new JLabel();
		add(label);
		setBackground(Color.RED);
	}
	
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		int index = storage.getclasssize();
		
	}

}
