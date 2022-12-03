


import java.awt.Graphics;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 */
public abstract class RelationshipDecorator implements DrawConnections {
	
	/**
	 * abstract Decorator class
	 * @param DrawConnections object
	 */
	protected DrawConnections r;

	RelationshipDecorator(DrawConnections r) {
		this.r = r;

	}
	
	/**
	 * Makes undirected association between 2 classes, concrete decorator, we decorate it with arrow or diamond based on selected relationship
	 * @param graphics object
	 * @param x coordinate of class1
	 * @param x coordinate of class2
	 * @param y coordinate of class1
	 * @param y coordinate of class2
	 */
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		this.r.draw(g, x1, y1, x2, y2);
	}

}
