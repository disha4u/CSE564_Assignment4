package com.asu.cse.asssigments.project;

import java.awt.Graphics;

public  class Relationship {
	
	String name, class1,class2;

	/**
	* Plots the graph
	* @param graphics object
	*/
	Relationship(String name,String class1,String class2)
	{
		this.name=name;
		this.class1=class1;
		this.class2=class2;
	}
//	public abstract void draw( Graphics g);
	
	/**
 	 * @param name of class1
 	 */
 	public void setclass1(String val) {
 		class1=val;
 	}
 	
 	/**
 	 * @param name of class2
 	 */
 	public void setclass2(String val) {
 		class2=val;
 	}
 	
	
	/**
	 * @param name of the relationship
	 */
	public void setname(String val) {
		name=val;
	}
	
	/**
	 * @return name of the relationship
	 */
	public String getname() {
		return name;
	}
	
	
 	/**
 	 * @return name of class1
 	 */
 	public String getclass1() {
 		return class1;
 	}
 	
 	/**
 	 * @return name of class2
 	 */
 	public String getclass2() {
 		return class2;
 	}
	
	@Override
	public String toString() {
		return name+","+class1+","+class2;
	}
}
