import java.awt.Graphics;

/**
 * This is an interface for drawing the connections
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public interface DrawConnections {
	/**
	 * Method to draw the connections
	 * @param g Graphics
	 * @param x1 int
	 * @param y1 int
	 * @param x2 int
	 * @param y2 int
	 */
	public void draw(Graphics g, int x1, int y1, int x2, int y2);
}
