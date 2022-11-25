package com.asu.cse.asssigments.project;
public class InheritanceHandler extends ConcreteHandler {
 
	@Override
	public String getSourceCode(Relationship r,String sourceCode) {  
		// TODO Auto-generated method stub
		if(r.name.toLowerCase().equals("inheritance"))
		{ 
			 
			        // System.out.println("Hello, World!");
			    //   	String sourceCode="class A \n{\n}\n";// extends B,C\n{\n}";
			       	System.out.println(sourceCode);
			       	int index=sourceCode.indexOf("class"+" "+r.class1);
					String beforBrace= sourceCode.substring(index,sourceCode.indexOf("{",index));
					if(beforBrace.contains("extends"))
					{
					    int extendsIndex=sourceCode.indexOf("extends",index)+"extends".length()+1;
					    
					      sourceCode=sourceCode.substring(0,extendsIndex)+r.class2+","+sourceCode.substring(extendsIndex,sourceCode.length());
					    
					    
					    //sourceCode=sourceCode.substring(0,)
					}
					else
					{   
					    int braceIndex=sourceCode.indexOf("{",index);
					    sourceCode=sourceCode.substring(0,braceIndex-2)+" extends "+r.class2;
					    
					}
				//	System.out.println(index+" "+beforBrace);
				    System.out.println(sourceCode);	
			    
		}
		else
		{
			sourceCode=successor.getSourceCode(r, sourceCode);
		}
		return sourceCode;
	}
}
