


import java.awt.Graphics;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 */
public class Relationship {

	String name, class1, class2;

	/**
	 * Creates relationship object
	 * @param name of the relationship
	 * @param class1
	 * @param class2
	 */
	Relationship(String name, String class1, String class2) {
		this.name = name;
		this.class1 = class1;
		this.class2 = class2;
	}

	/**
	 * @param name of class1
	 */
	public void setclass1(String val) {
		class1 = val;
	}

	/**
	 * @param name of class2
	 */
	public void setclass2(String val) {
		class2 = val;
	}

	/**
	 * @param name of the relationship
	 */
	public void setname(String val) {
		name = val;
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

	/**
	 * @return string representation of relationship
	 */
	@Override
	public String toString() {
		return class1 + "," + class2 + "," + name;
	}
}
