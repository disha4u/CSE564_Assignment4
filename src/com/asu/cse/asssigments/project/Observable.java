package com.asu.cse.asssigments.project;


import java.util.*;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public abstract class Observable {
	protected List<Observer> observers = new ArrayList<Observer>();

	/**
	 * Notifies Observers the current state
	 */
	public void Notify() {
		for (Observer o : observers) {
			o.Update(this);
		}

	}

	/**
	 * adds Observer to the list of observers
	 * 
	 * @param Observer object
	 */
	public void addObservers(Observer o) {
		observers.add(o);
	}

	/**
	 * removes Observer from the list of observers
	 * 
	 * @param Observer object
	 */
	public void removeObservers(Observer o) {
		observers.remove(o);
	}
}