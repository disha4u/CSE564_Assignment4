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
	 static String c1,c2;
	 static int clickNumber = 0;

	 Controller(Drawable d){
    	this.d=d;
    }
    
    Controller(){
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		FileOperations operations = new FileOperations();
		if(action.equals("Help")) {
			Help help = new Help();
			help.setSize(400, 200);
			help.setTitle("About");
			help.setVisible(true);
		}
		else if(action.equals("Save")) {
			operations.tofile("Save.txt");
		} else if(action.equals("Load")) {
			File filePath = operations.getFilePath();
			if(!filePath.equals(null)) {
				operations.fromfile(filePath);
			}
			DrawRectangle s= new DrawRectangle();
			s.draw(d);
		}
		else if(action.equals("New")) {
			Storage bb=Storage.getInstance();
			bb.cleardata();
		}
		else if(action.equals("Association")) {
			Relationship r=new Relationship("Association",c1,c2);
			Storage bb=Storage.getInstance();
			c1="";
			c2="";
			bb.addrelationship(r);
		}
		else if(action.equals("Composition")) {
			Relationship r=new Relationship("Composition",c1,c2);
			Storage bb=Storage.getInstance();
			bb.addrelationship(r);
		}
		else if(action.equals("Inheritance")) {
			Relationship r=new Relationship("Inheritance",c1,c2);
			Storage bb=Storage.getInstance();
			bb.addrelationship(r);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		double x, y; 
		x=e.getX(); 
		y=e.getY();
		Evaluator evaluator = new Evaluator();
		
		String result;
		if(clickNumber==0) {
			result = evaluator.evaluateCollision(x, y);
			if(result.length() != 0) {
				System.out.println(result+" Class exists");
				c1=result;
				clickNumber=1;
			}
			else {
				DrawRectangle s= new DrawRectangle();
				
				s.draw(d, x, y);
				
			}
		}
		else if(clickNumber == 1) {
			result = evaluator.evaluateCollision(x, y);
			if(result.length() != 0) {
				System.out.println(result+" Class 2 exists");
				c2=result;
				DrawRelationship dr=new DrawRelationship();
                dr.draw();
				
				clickNumber = 0;
			}
		}
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
