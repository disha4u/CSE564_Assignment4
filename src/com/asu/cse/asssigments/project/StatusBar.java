package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class StatusBar extends JPanel implements Observer {

	StatusBar()
	{
//		setSize(new Dimension(400, 400));
		setBackground(Color.RED);
	}
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		
	}

}
