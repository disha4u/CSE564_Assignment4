package com.asu.cse.asssigments.project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Inheritance extends RelationshipDecorator {

	public Inheritance(DrawConnections r){
		super(r);
	}

	@Override
	public void draw(Graphics g,int x1,int y1,int x2,int y2) {
		// TODO Auto-generated mthod stub
		super.draw(g, x1, y1, x2, y2);
		Graphics2D graphics = (Graphics2D) g.create();
//		graphics.draw(new Line2D.Double(x1,y1,x2,y2));
		int size=10;
		int []xcoors= {x2,x2-5,x2+5};
		int []ycoors= {y2-5,y2+5,y2+5};
		graphics.drawPolygon(xcoors,ycoors, 3);
//		int []xcoors= {x2+5,x2+10,x2+5,x2};
//		int []ycoors= {y2,y2+5,y2+10,y2+5};

//		(x + Width/2, y)
//		(x + Width, y + Height/2)
//		(x + Width/2, y + Height)
//		(x, y + Height/2)
		
	}

}
