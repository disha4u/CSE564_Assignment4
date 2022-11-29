package com.asu.cse.asssigments.project;
public class InheritanceHandler extends ConcreteHandler {
 
	@Override
	public String getSourceCode(Relationship r,String sourceCode) {  
		// TODO Auto-generated method stub
		if(r.getname().toLowerCase().equals("inheritance"))
		{ 
			 
			        // System.out.println("Hello, World!");
			    //   	String sourceCode="class A \n{\n}\n";// extends B,C\n{\n}";
			       	System.out.println(r.getname());
			       	int index=sourceCode.indexOf("class"+" "+r.getclass1());
					String beforBrace= sourceCode.substring(index,sourceCode.indexOf("{",index));
					System.out.println("beforBrace "+beforBrace);
					if(beforBrace.contains("extends"))
					{
					    int extendsIndex=sourceCode.indexOf("extends",index)+"extends".length()+1;
					    

					      sourceCode=sourceCode.substring(0,extendsIndex)+r.getclass2()+","+sourceCode.substring(extendsIndex,sourceCode.length());

					    
					    
					    //sourceCode=sourceCode.substring(0,)
					}
					else
					{   
					    int braceIndex=sourceCode.indexOf("{",index);
					    System.out.println("braceIndex "+braceIndex);
					    sourceCode=sourceCode.substring(0,braceIndex)+" extends "+r.getclass2()+sourceCode.substring(braceIndex-1, sourceCode.length());
					    
					}
				//	System.out.println(index+" "+beforBrace);


			    
		}
		else
		{
			sourceCode=successor.getSourceCode(r, sourceCode);
		}
		return sourceCode;
	}
}
