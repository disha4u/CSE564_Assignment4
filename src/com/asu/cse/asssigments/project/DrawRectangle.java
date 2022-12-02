package com.asu.cse.asssigments.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JOptionPane;

public class DrawRectangle implements Strategy{

	@Override
	public void draw(Drawable d,double x, double y) {
		// TODO Auto-generated method stub
		
		
		//Graphics2D graphics = (Graphics2D) g.create();
		//graphics.fill(new Rectangle2D.Double(BoxDimesions.length, BoxDimesions.width, x, y));
		//graphics.setColor(Color.RED);
		
		String text = (String) JOptionPane.showInputDialog("Enter name:");
		
		if(text!=null) {
			Objects o=new Objects(text,x,y);
			Storage bb=Storage.getInstance();
			bb.addclass(o);
		    d.settxt(text);
		    d.setxy(x-BoxDimesions.length/2, y-BoxDimesions.width/2);
		    d.repaint();
		}
		
	}
	
	public void draw(Drawable d) {
		d.repaint();
	}

	
}
