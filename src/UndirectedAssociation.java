


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 */
public class UndirectedAssociation implements DrawConnections {

	public UndirectedAssociation() {

	}

	/**
	 * Makes undirected association between 2 classes, concrete decorator, we decorate it with arrow or diamond based on selected relationship
	 * @param graphics object
	 * @param x coordinate of class1
	 * @param x coordinate of class2
	 * @param y coordinate of class1
	 * @param y coordinate of class2
	 */
	@Override
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.draw(new Line2D.Double(x1, y1, x2, y2));
	}

}
