package com.asu.cse.asssigments.project;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class Storage extends Observable implements Observer {

	static ArrayList<Objects> classes;
	static ArrayList<Relationship> rs;
	protected static Storage instance;
	
	/**
	* Private Constructor for Singleton
	*/
	protected Storage()
	{
		
	}
	
	/**
	* @return singleton Evaluator instance
	*/
	public static Storage getInstance()
	{
		if(instance==null)
			instance= new Storage();
		return instance;
	}
	
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		
	}
	public void tofile(String fname) {
		try {
		FileWriter writer = new FileWriter(fname); 
		String str;
		int i;
		writer.write("Classes"+System.lineSeparator());
		for(i=0;i<classes.size();i++) {
			
			str=classes.get(i).toString();
		    writer.write(str + System.lineSeparator());
		}
		writer.write("Relationships"+System.lineSeparator());
		for(i=0;i<rs.size();i++) {
			
			str=rs.get(i).toString();
		    writer.write(str + System.lineSeparator());
		}
		

		writer.close();
		}
		catch(Exception e) {
			
		}
	}
	public void fromfile(String fname) {
       try {
			
			File myObj = new File(fname);
		    Scanner myReader = new Scanner(myObj);
		    int i=0;
		    while (myReader.hasNextLine()) {
		        String line = myReader.nextLine();
		        if(i==0)
		        	continue;
		        if(line.startsWith("Relationships"))
		        	break;
		        String[] s=line.split(",",3);
		        Objects o=new Objects(s[0],Double.parseDouble(s[1]),Double.parseDouble(s[2]));
		        classes.add(o);
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
		        rs.add(r);
		        
		    }
		    
		    myReader.close();
		

		
		}
		catch(Exception e) {
			
		}
	}
	
	public void New() {
		classes.clear();
		rs.clear();
	}
    
}
