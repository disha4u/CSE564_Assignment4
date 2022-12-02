package com.asu.cse.asssigments.project;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Composition extends RelationshipDecorator{

	public Composition(DrawConnections r){
		super(r);
//		name="Composition";
//		class1=c1;
//		class2=c2;
	}

	@Override
	public void draw(Graphics g,int x1,int y1,int x2,int y2) {
		// TODO Auto-generated method stub
		super.draw(g, x1, y1, x2, y2);
		int temp;
//		x1=temp;
//	
		Graphics2D graphics = (Graphics2D) g.create();
//		super.draw(g, x1, y1, x2, y2);
		int []xcoors= {x1,x1+5,x1+10,x1+5};
		int []ycoors= {y1,y1-5,y1+5,y1+10};
		graphics.drawPolygon(xcoors,ycoors, 4);
	}


}
