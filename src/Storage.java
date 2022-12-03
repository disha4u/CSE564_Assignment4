


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
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
	 * @return singleton Evaluator instance
	 */
	public static Storage getInstance() {
		if (instance == null)
			instance = new Storage();
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
		if (classes == null) {
			return 0;
		} else {
			return classes.size();
		}
	}

	public int getrelationshipsize() {
		if (rs == null) {
			return 0;
		} else {
			return rs.size();
		}
	}

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

	public void cleardata() {
		classes.clear();
		rs.clear();
		super.Notify();
	}
}