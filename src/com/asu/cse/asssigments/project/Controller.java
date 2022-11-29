package com.asu.cse.asssigments.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		FileOperations operations = new FileOperations();
		if(action.equals("Save")) {
			//String filePath = operations.getFilePath();
			//if(!filePath.equals("Error While Reading File")) {
			operations.tofile("Save.txt");
		//}
		} else if(action.equals("Load")) {
			String filePath = operations.getFilePath();
			if(!filePath.equals("Error While Reading File")) {
				operations.fromfile(filePath);
			}
		}
		
	}
	
}
