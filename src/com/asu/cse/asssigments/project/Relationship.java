package com.asu.cse.asssigments.project;
public abstract class Relationship {
	
	String name,class1,class2;

	/**
	* Plots the graph
	* @param graphics object
	*/
	public  abstract void draw();
	
	@Override
	public String toString() {
		return name+","+class1+","+class2;
	}
}
