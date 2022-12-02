package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Drawable extends JPanel{
	
	double x,y;
	String cname="";
	public void setxy(double x,double y) {
		this.x=x;
		this.y=y;
		System.out.println("drawable "+x);
		System.out.println("drawable "+y);
		
	}
	public void settxt(String txt) {
		this.cname=txt;
		
		
	}
	
	Drawable()
	{
		setBackground(Color.GREEN);
	}
	
	
	public void paintComponent(Graphics g) {
		System.out.println("pc "+x);
		System.out.println("pc "+y);
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setColor(Color.GREEN);
		graphics.fill(new Rectangle2D.Double(x, y,BoxDimesions.length, BoxDimesions.width));
		graphics.setColor(Color.RED);
		
		graphics.drawString(cname, (int)x, (int)y+BoxDimesions.width/2);
		
		this.updateUI();
		
	}

}
