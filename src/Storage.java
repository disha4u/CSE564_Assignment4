


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 */
public class Storage extends Observable {

	private ArrayList<Objects> classes;
	private ArrayList<Relationship> rs;
	protected static Storage instance;
	boolean addedclass;
	boolean addedrelationship;

	/**
	 * Private Constructor for Singleton
	 */
	protected Storage() {
		classes = new ArrayList<Objects>();
		rs = new ArrayList<Relationship>();
	}

	/**
	 * Returns the blackboard instance or creates one if instance is null
	 * @return singleton Evaluator instance
	 */
	public static Storage getInstance() {
		if (instance == null)
			instance = new Storage();
		return instance;
	}
	
	/**
	 * Adds class object to storage
	 * @param class object
	 */
	public void addclass(Objects o) {
		classes.add(o);
		super.Notify();
	}
	
	/**
	 * Adds relationship object to storage
	 * @param relationship object
	 */
	public void addrelationship(Relationship r) {
		rs.add(r);
		super.Notify();
	}

	/**
	 * Returns the class 
	 * @param index of the class to be fetched
	 * @return the class object
	 */
	public Objects readclass(int index) {
		return classes.get(index);
	}

	/**
	 * Returns the relationship 
	 * @param index of the relationship to be fetched
	 * @return the relationship object
	 */
	public Relationship readrelationship(int index) {
		return rs.get(index);
	}
	
	/**
	 * Returns the number of classes stored
	 * @return the number of classes stored
	 */
	public int getclasssize() {
		if (classes == null) {
			return 0;
		} else {
			return classes.size();
		}
	}

	/**
	 * Returns the number of relationships stored
	 * @return the number of relationships stored
	 */
	public int getrelationshipsize() {
		if (rs == null) {
			return 0;
		} else {
			return rs.size();
		}
	}

	/**
	 * Updates coordinates of the class when it is is dragged to new position
	 */
	public void modifyclass(String name, double x, double y) {
		for (int i = 0; i < classes.size(); i++) {
			if (classes.get(i).getname().equals(name)) {
				classes.get(i).setx(x);
				classes.get(i).sety(y);
			}
		}
	}

	public int getRelationshipSize() {
		if (rs == null)
			return 0;
		return this.rs.size();
	}

	/**
	 * When new is clicked it removes all the classes and relationships thar were stored
	 */
	public void cleardata() {
		classes.clear();
		rs.clear();
		super.Notify();
	}
}