


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class Inheritance extends RelationshipDecorator {
	/**
	 * sets the object to the parent
	 * @param DrawConnections r
	 */
	public Inheritance(DrawConnections r) {
		super(r);
	}
	/**
	 * Overrides method from Draw connections and draws a triangle
	 * @param Graphics g
	 * @param int x1
	 * @param int y1
	 * @param int x2
	 * @param int y2
	 */
	@Override

	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated mthod stub
		super.draw(g, x1, y1, x2, y2);
		Graphics2D graphics = (Graphics2D) g.create();
		int size = 10;
		int[] xcoors = { x2, x2 - 5, x2 + 5 };
		int[] ycoors = { y2 - 5, y2 + 5, y2 + 5 };
		graphics.drawPolygon(xcoors, ycoors, 3);

	}

}
