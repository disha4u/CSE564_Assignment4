package com.asu.cse.asssigments.project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Controller implements ActionListener,MouseListener {
	 Drawable d;
	double startx,starty;
    Controller(Drawable d){
    	this.d=d;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		FileOperations operations = new FileOperations();
		if(action.equals("Save")) {
			operations.tofile("Save.txt");
		} else if(action.equals("Load")) {
			File filePath = operations.getFilePath();
			if(!filePath.equals(null)) {
				operations.fromfile(filePath);
			}
		}
		else if(action.equals("New")) {
			Storage bb=Storage.getInstance();
			bb.cleardata();
		}
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		double x,y;
		x=e.getX();
		y=e.getY();
		
		
		Strategy s;
		
		
		//d.repaint();
		//s.draw();
		
		Storage bb=Storage.getInstance();
		double x1,y1;
		int flag=0;
        for(int i=0;i<bb.getclasssize();i++) {
			
			x1=bb.readclass(i).getx();
			y1=bb.readclass(i).gety();
			if(Math.abs(x-x1)<BoxDimesions.length || Math.abs(y-y1)<BoxDimesions.width) {
				System.out.println("class already exists");
				flag=1;
				break;
			}
			
		    
		}
        if(flag==1) {
        	
        }
        else {
        	s= new DrawRectangle();
    		
    		//Drawable d=(Drawable)e.getSource();
    		System.out.println(e);
    		
    		System.out.println("controller "+x+" "+y);
    		s.draw(d,x,y);
        }
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
