package com.asu.cse.asssigments.project;

import java.awt.Graphics;

public abstract class RelationshipDecorator extends Relationship{
	
	protected Relationship r;
	
	public abstract void draw(Graphics g);

}
