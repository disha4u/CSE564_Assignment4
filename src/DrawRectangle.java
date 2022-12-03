

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JOptionPane;

public class DrawRectangle {

	
	public void draw(Drawable d,double x, double y) {
		// TODO Auto-generated method stub
			
		String text = (String) JOptionPane.showInputDialog("Enter name:");
		
		if(text!=null) {
			Objects o=new Objects(text,x,y);
			Storage bb=Storage.getInstance();
			bb.addclass(o);
		    d.settxt(text);
		    d.setxy(x-BoxDimesions.length/2, y-BoxDimesions.width/2);
		    d.repaint();
		}
		
	}
	
	public void draw(Drawable d) {
		d.repaint();
	}

	
}
