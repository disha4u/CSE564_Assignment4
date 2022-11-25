package com.asu.cse.asssigments.project;
import java.io.FileWriter;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel implements Observer,Runnable{
	Storage storage = Storage.getInstance();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String code = null;
		int i;
		for(i=0;i<storage.getclasssize();i++) {
			Objects currentClass = storage.readclass(i); 
			String className = currentClass.getname();
			code+="Class "+ className + "{\n}\n";
		}
		Writable writable = new Writable();
		writable.setText(code);
		writable.setVisible(true);
		//for(i=0;i<storage.getrelationshipsize();i++) {
		//	str=storage.readrelationship(i).toString();
		//}
	}

	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		run();
	}
}
