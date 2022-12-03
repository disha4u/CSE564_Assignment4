/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
package com.asu.cse.asssigments.project;

public class CompositionHandler extends ConcreteHandler {

	@Override
	public String getSourceCode(Relationship r, String sourceCode) {

		String s[];
		int indexclass1, brace;
		if (r.getname().toLowerCase().equals("composition")) {
			indexclass1 = sourceCode.indexOf("class" + " " + r.getclass1());
			brace = sourceCode.indexOf("{", indexclass1);
			sourceCode = sourceCode.join(r.getclass2() + "\n", sourceCode.substring(0, brace + 2),
					sourceCode.substring(brace + 2, sourceCode.length()));

		} else {
			sourceCode = successor.getSourceCode(r, sourceCode);
		}
		return sourceCode;

	}
}
