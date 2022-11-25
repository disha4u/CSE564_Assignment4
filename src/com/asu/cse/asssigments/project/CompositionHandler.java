package com.asu.cse.asssigments.project;
public class CompositionHandler extends ConcreteHandler{

	
	@Override
	public String getSourceCode(Relationship r,String sourceCode) {
		// TODO Auto-generated method stub
		String s[];
		int indexclass1,brace;
//		if(r.getname().toLowerCase().equals("composition"))
		{
			indexclass1=sourceCode.indexOf("class"+" "+r.getclass1());
			brace=sourceCode.indexOf("{",indexclass1);
		    
		    sourceCode=sourceCode.join("\n"+r.getclass2(),sourceCode.substring(0,brace),sourceCode.substring(brace,sourceCode.length()-1) );
		       
	    }
		return sourceCode;
		
}
}
