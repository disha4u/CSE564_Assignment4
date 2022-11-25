package com.asu.cse.asssigments.project;
/**
*@author Ramachandra Sai
*@author Disha Agarawal
*@author Harshit 
*/
public interface Observer {
	
	/**
	* updates the status to be same as observable state
	* @param Observable object
	*/
	public void Update(Observable o);
}
