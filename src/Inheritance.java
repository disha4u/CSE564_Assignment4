


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

	public Inheritance(DrawConnections r) {
		super(r);
	}

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
