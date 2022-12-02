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

		Graphics2D graphics = (Graphics2D) g.create();
		super.draw(g, x1, y1, x2, y2);
		int []xcoors= {x2,x2+5,x2+10,x2+5};
		int []ycoors= {y2,y2-5,y2+5,y2+10};
		graphics.drawPolygon(xcoors,ycoors, 4);
	}


}
