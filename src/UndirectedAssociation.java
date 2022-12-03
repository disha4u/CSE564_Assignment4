
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
public class UndirectedAssociation implements DrawConnections {

	public UndirectedAssociation() {
//		name="Associtaion";
//		class1=c1;
//		class2=c2;
	}

	@Override
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.draw(new Line2D.Double(x1, y1, x2, y2));
	}

}
