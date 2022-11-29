package com.asu.cse.asssigments.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class Storage extends Observable{

	private ArrayList<Objects> classes;
	private ArrayList<Relationship> rs;
	protected static Storage instance;
	boolean addedclass;
	boolean addedrelationship;
	
	/**
	* Private Constructor for Singleton
	*/
	protected Storage()
	{
//		Objects currentClass = new Objects("A",20,20);
		classes = new ArrayList<Objects>();
		rs = new ArrayList<Relationship>();
//		classes.add(currentClass);
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
	
	public void addclass(Objects o) {
		classes.add(o);
		super.Notify();
	}
	
    public void addrelationship(Relationship r) {
		rs.add(r);
		super.Notify();
	}

	public Objects readclass(int index) {
       return classes.get(index);
	}
	
	public Relationship readrelationship(int index) {
	       return rs.get(index);
	}
	
	
	public int getclasssize() {
		if(classes==null)
			return 0;
	       return classes.size();
		}
		
	public int getrelationshipsize() {
		if(rs==null)
			return 0;
		       return rs.size();
		}
	
	public void cleardata() {
		classes.clear();
		rs.clear();
	}
}