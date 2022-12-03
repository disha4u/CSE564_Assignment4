

public class Evaluator {
	public String evaluateCollision(double x, double y) {
		String result = "";
		Storage s = Storage.getInstance();
		for(int i=0;i<s.getclasssize();i++) {
			double x1=s.readclass(i).getx();
			double y1=s.readclass(i).gety();
			//System.out.print("Checking Collison");
			if(Math.abs(x-x1)<BoxDimesions.length/2 || Math.abs(y-y1)<BoxDimesions.width/2) {
				//System.out.print("Here true");
				result = s.readclass(i).getname();
				break;
			}
		}
		return result;
	}
}
