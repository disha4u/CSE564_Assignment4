package com.asu.cse.asssigments.project;


/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class AssociationHandler implements Handler {

	@Override
	public String getSourceCode(Relationship r, String sourceCode) {
		String s[];
		int indexclass1, brace;
		indexclass1 = sourceCode.indexOf("class" + " " + r.getclass1());
		brace = sourceCode.indexOf("}", indexclass1);
		String classstr = sourceCode.substring(indexclass1, brace);
		if (classstr.contains("method()")) {
			int ind = sourceCode.indexOf("method()");
			sourceCode = sourceCode.join(r.getclass2() + "\n", sourceCode.substring(0, ind + 10),
					sourceCode.substring(ind + 10, sourceCode.length()));
		} else {
			sourceCode = sourceCode.join("\nmethod(){\n" + r.getclass2(), sourceCode.substring(0, brace - 1),
					sourceCode.substring(brace - 1, sourceCode.length()));

		}
		return sourceCode;

	}

}
