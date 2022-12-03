

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Composition extends RelationshipDecorator{

	public Composition(DrawConnections r){
		super(r);

	}

	@Override
	public void draw(Graphics g,int x1,int y1,int x2,int y2) {

		super.draw(g, x1, y1, x2, y2);
		int temp;
		Graphics2D graphics = (Graphics2D) g.create();
		int []xcoors= {x1,x1+5,x1+10,x1+5};
		int []ycoors= {y1,y1-5,y1+5,y1+10};
		graphics.fillPolygon(xcoors,ycoors, 4);
		
	}


}
