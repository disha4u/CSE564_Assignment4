package com.asu.cse.asssigments.project;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileOperations {
	
	public File getFilePath() {
        System.out.println("Here");
		try{
        	JFileChooser jFileChooser = new JFileChooser();
        	FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
            jFileChooser.addChoosableFileFilter(filter);
            jFileChooser.showOpenDialog(null);
            File file = jFileChooser.getSelectedFile();
            return(file);
        }catch(Exception e) {
        	return null;
        }
	}
	
	public void tofile(String fname) {
		try {
	    Storage bb=Storage.getInstance();
		FileWriter writer = new FileWriter(fname); 
		String str;
		int i;
		writer.write("Classes"+System.lineSeparator());
		for(i=0;i<bb.getclasssize();i++) {
			
			str=bb.readclass(i).toString();
			
		    writer.write(str + System.lineSeparator());
		}
		writer.write("Relationships"+System.lineSeparator());
		for(i=0;i<bb.getrelationshipsize();i++) {
			
			str=bb.readrelationship(i).toString();
		    writer.write(str + System.lineSeparator());
		}
		writer.close();
		}
		catch(Exception e) {
			
		}
	}
	
	
	public void fromfile(File file) {
	       try {
				Storage bb=Storage.getInstance();
				//File myObj = new File(fname);
			    Scanner myReader = new Scanner(file);
			    int i=0;
			    while (myReader.hasNextLine()) {
			    	System.out.println("hi2");
			        String line = myReader.nextLine();
			        if(i==0) {
			        	i++;
			        	continue;
			        }
			        if(line.startsWith("Relationships"))
			        	break;
			        System.out.println("hi3");
			        String[] s=line.split(",",3);
			        Objects o=new Objects(s[0],Double.parseDouble(s[1]),Double.parseDouble(s[2]));
			        System.out.println("hi4");
			        bb.addclass(o);
			        System.out.println("hi5");
			        System.out.println(o.toString());
			        i++;
			        
			    }
			    while (myReader.hasNextLine()) {
			        String line = myReader.nextLine();
			        String[] s=line.split(",",3);
			        Relationship r;
			        switch(s[2]) {
			        case "Inheritance":
			        	r=new Inheritance(s[0],s[1]);
			        	break;
			        case "Composition":
			        	r=new Composition(s[0],s[1]);
			        	break;
			        case "Association":
			        	r=new Inheritance(s[0],s[1]);
			        	break;
			        default:
			        	r=new UndirectedAssociation(s[0],s[1]);
			        }
			        System.out.println(r);
			        System.out.println(s[0]);
			        bb.addrelationship(r);
			        System.out.print("Added Relationship");
			    }
			    myReader.close();
			}
			catch(Exception e) {
				System.out.println("file not found"+e);
			}
		}
		
		public void New() {
			Storage s=Storage.getInstance();
			s.cleardata();
		}
}
