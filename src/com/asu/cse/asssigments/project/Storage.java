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
	
		
	
	public void adddata() {
		
	}
	public void readdata(String fname) {
       
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
