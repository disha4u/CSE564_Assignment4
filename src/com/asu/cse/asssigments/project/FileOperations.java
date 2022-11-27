package com.asu.cse.asssigments.project;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperations {
	
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
	
	
	public void fromfile(String fname) {
		System.out.println("hi1");
	       try {
				Storage bb=Storage.getInstance();
				File myObj = new File(fname);
			    Scanner myReader = new Scanner(myObj);
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
			        switch(s[0]) {
			        case "Inheritance":
			        	r=new Inheritance(s[1],s[2]);
			        	break;
			        case "Composition":
			        	r=new Composition(s[1],s[2]);
			        	break;
			        case "Association":
			        	r=new Inheritance(s[1],s[2]);
			        	break;
			        default:
			        	r=new UndirectedAssociation(s[1],s[2]);
			        }
			        bb.addrelationship(r);
			        
			        
			    }
			    
			    myReader.close();
			

			
			}
			catch(Exception e) {
				System.out.println("file not found "+fname);
			}
		}
		
		public void New() {
			Storage s=Storage.getInstance();
			s.cleardata();
		}
}
