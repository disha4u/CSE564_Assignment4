


/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class Objects {
	String name;
	double xcoor, ycoor;

	/**
	 * Creates class object
	 * @param name of the class
	 * @param x coordinate
	 * @param y coordinate
	 */
	public Objects(String s, double x, double y) {

		this.name = s;
		this.xcoor = x;
		this.ycoor = y;
	}

	/**
	 * @param value of x coordinate
	 */
	public void setx(double val) {
		xcoor = val;
	}

	/**
	 * @param value of y coordinate
	 */
	public void sety(double val) {
		ycoor = val;
	}

	/**
	 * @param value of name of the class
	 */
	public void setname(String val) {
		name = val;
	}

	/**
	 * @return value name of the class
	 */
	public String getname() {
		return name;
	}

	/**
	 * @return value of x coordinate
	 */
	public double getx() {
		return xcoor;
	}

	/**
	 * @return value of y coordinate
	 */
	public double gety() {
		return ycoor;
	}

	/**
	 * @return string representation of class object
	 */
	@Override
	public String toString() {
		return name + "," + xcoor + "," + ycoor;
	}
}
