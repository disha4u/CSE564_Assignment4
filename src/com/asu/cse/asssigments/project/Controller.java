package com.asu.cse.asssigments.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Controller implements ActionListener {

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
		
	}
	
}
