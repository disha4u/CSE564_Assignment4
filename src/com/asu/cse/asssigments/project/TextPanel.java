package com.asu.cse.asssigments.project;
import java.io.FileWriter;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel implements Observer,Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		Storage bb=Storage.getInstance();
		
		String str;
		int i;
		
		for(i=0;i<bb.getclasssize();i++) {
			
			str=bb.readclass(i).toString();
			
		    
		}
		
		for(i=0;i<bb.getrelationshipsize();i++) {
			
			str=bb.readrelationship(i).toString();
		    
		}
	}

	
	

}
