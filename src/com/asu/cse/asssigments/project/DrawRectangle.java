package com.asu.cse.asssigments.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JOptionPane;

public class DrawRectangle implements Strategy{

	@Override
	public void draw(Graphics g,double x, double y) {
		// TODO Auto-generated method stub
		
		System.out.println("Drwable "+x+" "+y);
		
		Graphics2D graphics = (Graphics2D) g.create();
//		graphics.fill(new Rectangle2D.Double(BoxDimesions.length, BoxDimesions.width, x, y));
		//graphics.setColor(Color.RED);
//		graphics.
//		graphics.fill(new Rectangle2D.Double(x, y,BoxDimesions.length, BoxDimesions.width));
		graphics.fill(new Rectangle2D.Double(200, 250, 150, 100));
//		graphics.drawString(text, 0, 0);
//		d.setxy(x-BoxDimesions.length/2, y-BoxDimesions.width/2);
//		 graphics.drawString(text, 250, 300);
		
//		System.out.println((int) (x-BoxDimesions.length/2)+" "+(int)(y-BoxDimesions.width/2));
//		 String text = (String) JOptionPane.showInputDialog( "Enter name of");
		
//		 graphics.drawString(text,(int)(x-BoxDimesions.length/2), (int)(y-BoxDimesions.width/2));
//		graphics.repaint();
//		g.repaint();
	}

	
}
