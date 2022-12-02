package com.asu.cse.asssigments.project;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Association extends RelationshipDecorator{

	public Association(String c1,String c2){
		name="Associtaion";
		class1=c1;
		class2=c2;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
//		Graphics2D graphics = (Graphics2D) g.create();
//		graphics.drawLine(120, 50, 360, 50);
	}


}
