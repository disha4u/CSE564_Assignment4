package com.asu.cse.asssigments.project;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class Storage implements Runnable {

	static ArrayList<Objects> classes;
	static ArrayList<Relationship> rs;
	protected static Storage instance;
	boolean addedclass;
	boolean addedrelationship;
	
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
	
		
	
	public void addclass(Objects o) {
		classes.add(o);
	}
	
    public void addrelationship(Relationship r) {
		rs.add(r);
	}

	public Objects readclass(int index) {
       return classes.get(index);
	}
	
	public Relationship readrelationship(int index) {
	       return rs.get(index);
	}
	
	
	public int getclasssize() {
	       return classes.size();
		}
		
	public int getrelationshipsize() {
		       return rs.size();
		}
	
	public void cleardata() {
		classes.clear();
		rs.clear();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
