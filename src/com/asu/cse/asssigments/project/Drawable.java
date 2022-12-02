package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Drawable extends JPanel{
	
	double x,y;
	String cname="";
	int i=0;
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
		
		//setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		Storage s = Storage.getInstance();
		for(int i=0;i<s.getclasssize();i++) {
			Graphics2D graphics = (Graphics2D) g.create();
			graphics.setColor(Color.YELLOW);
			graphics.fill(new Rectangle2D.Double(s.readclass(i).getx(), s.readclass(i).gety(),BoxDimesions.length, BoxDimesions.width));
			graphics.setColor(Color.BLACK);
			graphics.drawString(s.readclass(i).name, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2));
		}	
		this.repaint();
	}

}
