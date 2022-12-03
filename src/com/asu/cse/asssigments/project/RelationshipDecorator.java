package com.asu.cse.asssigments.project;

import java.awt.Graphics;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public abstract class RelationshipDecorator implements DrawConnections {

	protected DrawConnections r;

	RelationshipDecorator(DrawConnections r) {
		this.r = r;

	}

	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		this.r.draw(g, x1, y1, x2, y2);
	}

}
