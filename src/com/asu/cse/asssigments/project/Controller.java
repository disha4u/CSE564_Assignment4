package com.asu.cse.asssigments.project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Controller extends MouseAdapter implements ActionListener {
	
	

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
	
	public void mouseclicked(MouseEvent e) {
		double x,y;
		x=e.getX();
		y=e.getY();
		
		
		Strategy s;
		
		s= new DrawRectangle();
		
		
		
		
		s.draw(null, 0, 0);
		
		Storage bb=Storage.getInstance();
		
        for(int i=0;i<bb.getclasssize();i++) {
			
			bb.readclass(i);
			
		    
		}
	}
}
