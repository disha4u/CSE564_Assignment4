package com.asu.cse.asssigments.project;
import java.io.FileWriter;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel implements Observer,Runnable{
	Storage storage = Storage.getInstance();
	Writable writable;
	TextPanel(Writable writable)
	{
		this.writable=writable;
	}
	@Override
		public void run() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		String code = "";
=======
		String code = null;
		Relationship r;
		InheritanceHandler ih=new InheritanceHandler();
>>>>>>> b86c680a7f151244ef063bbf5a948cd66ad4097f
		int i;
		for(i=0;i<storage.getclasssize();i++) {
			Objects currentClass = storage.readclass(i); 
			String className = currentClass.getname();
			code+="Class "+ className + "{\n}\n";
		}
<<<<<<< HEAD
		
		
		
//		Writable writable = new Writable();
=======
        for(i=0;i<storage.getrelationshipsize();i++) {
        	r=storage.readrelationship(i);
        	code=ih.getSourceCode(r,code);
		    
		} 
		Writable writable = new Writable();
>>>>>>> b86c680a7f151244ef063bbf5a948cd66ad4097f
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
