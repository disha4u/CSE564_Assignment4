


/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class InheritanceHandler extends ConcreteHandler {
	/**
	 * Modifies the given sourcecode and returns updated to the next succecssor based on Inheritance relation 
	 * @param Relationship r
	 * @param String sourceCode 
	 * @return String
	 */
	@Override
	public String getSourceCode(Relationship r, String sourceCode) {
		// TODO Auto-generated method stub
		if (r.getname().toLowerCase().equals("inheritance")) {

		
			int index = sourceCode.indexOf("class" + " " + r.getclass1());
			String beforBrace = sourceCode.substring(index, sourceCode.indexOf("{", index));
			
			if (beforBrace.contains("extends")) {
				int extendsIndex = sourceCode.indexOf("extends", index) + "extends".length() + 1;

				sourceCode = sourceCode.substring(0, extendsIndex) + r.getclass2() + ","
						+ sourceCode.substring(extendsIndex, sourceCode.length());

			} else {
				int braceIndex = sourceCode.indexOf("{", index);
				
				sourceCode = sourceCode.substring(0, braceIndex) + " extends " + r.getclass2()
						+ sourceCode.substring(braceIndex - 1, sourceCode.length());

			}

		} else {
			sourceCode = successor.getSourceCode(r, sourceCode);
		}
		return sourceCode;
	}
}
