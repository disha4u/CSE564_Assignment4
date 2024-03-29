


/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class Evaluator {
	/**
	 * This Method check whether click happens at the same where class is present,
	 * @param double x
	 * @param double y
	 *  @return String   
	**/
	public String evaluateCollision(double x, double y) {
		String result = "";
		Storage s = Storage.getInstance();
		for (int i = 0; i < s.getclasssize(); i++) {
			double x1 = s.readclass(i).getx();
			double y1 = s.readclass(i).gety();
			if (Math.abs(x - x1) < BoxDimesions.length / 2 && Math.abs(y - y1) < BoxDimesions.width / 2) {
				result = s.readclass(i).getname();
				break;
			}
		}
		return result;
	}
}
