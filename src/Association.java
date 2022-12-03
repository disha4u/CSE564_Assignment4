import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * This class is for drawing the Association relationship which is part of decorator pattern
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class Association extends RelationshipDecorator {
	/**
	 * Constructor for the Association class
	 * @param r DrawConnections
	 */
	public Association(DrawConnections r) {
		super(r);
	}

	/**
	 * This functions draws the relationship arrowhead on the screen
	 */
	@Override
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {

		super.draw(g, x1, y1, x2, y2);
		Graphics2D graphics = (Graphics2D) g.create();
		double dx = x2 - x1;
		double dy = y2 - y1;
		double phi = Math.toRadians(40);
		int barb = 5;
		double theta = Math.atan2(dy, dx);
		double x, y, rho = theta + phi;
		for (int j = 0; j < 2; j++) {
			x = x2 - barb * Math.cos(rho);
			y = y2 - barb * Math.sin(rho);
			graphics.draw(new Line2D.Double(x2, y2, x, y));
			rho = theta - phi;
		}
	}

}
