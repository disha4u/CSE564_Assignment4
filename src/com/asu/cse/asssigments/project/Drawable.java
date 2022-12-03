package com.asu.cse.asssigments.project;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class Drawable extends JPanel {

	double x, y;
	String cname = "";
	int i = 0;
	int xcoor1, ycoor1, xcoor2, ycoor2;

	public void setxy(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public void settxt(String txt) {
		this.cname = txt;
	}

	Drawable() {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Storage s = Storage.getInstance();
		Graphics2D graphics = (Graphics2D) g.create();
		for (int i = 0; i < s.getclasssize(); i++) {

			graphics.setColor(Color.YELLOW);
			graphics.fill(new Rectangle2D.Double(s.readclass(i).getx() - BoxDimesions.length / 2,
					s.readclass(i).gety() - BoxDimesions.width / 2, BoxDimesions.length, BoxDimesions.width));
			graphics.setColor(Color.BLACK);
			graphics.drawString(s.readclass(i).name, (int) s.readclass(i).xcoor - BoxDimesions.length / 4,
					(int) (s.readclass(i).ycoor));
		}

		for (int i = 0; i < s.getRelationshipSize(); i++) {
			DrawConnections relationship;
			Relationship r = s.readrelationship(i);
			String firstclass = r.class1;
			String secondclass = r.class2;
			int x1 = 0;
			int y2 = 0;
			int x2 = 0;
			int y1 = 0;
			for (int j = 0; j < s.getclasssize(); j++) {
				if (s.readclass(j).name.equals(firstclass)) {
					x1 = (int) s.readclass(j).xcoor;// -+BoxDimesions.length/2;
					y1 = (int) s.readclass(j).ycoor;// -BoxDimesions.length/2;
				} else if (s.readclass(j).name.equals(secondclass)) {
					x2 = (int) s.readclass(j).xcoor;// -BoxDimesions.length/2;
					y2 = (int) s.readclass(j).ycoor;// -BoxDimesions.length/2;

				}

			}
			if (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0) {
				if (r.name.toLowerCase().equals("inheritance")) {
					relationship = new Inheritance(new UndirectedAssociation());
	
					relationship.draw(g, x1, y1, x2, y2);
				} else if (r.name.toLowerCase().equals("composition")) {
					relationship = new Composition(new UndirectedAssociation());
					relationship.draw(g, x1, y1, x2, y2);

				} else if (r.name.toLowerCase().equals("association")) {
					relationship = new Association(new UndirectedAssociation());

					relationship.draw(g, x1, y1, x2, y2);

				} else {
					relationship = new UndirectedAssociation();

					relationship.draw(g, x1, y1, x2, y2);

				}
			}
		}

		this.repaint();
	}

}
