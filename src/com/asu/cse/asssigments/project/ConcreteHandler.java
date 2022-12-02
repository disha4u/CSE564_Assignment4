package com.asu.cse.asssigments.project;

class ConcreteHandler implements Handler
{
	protected Handler successor;
	public void setSuccessor(Handler successor)
	{
		this.successor=successor;
	}
	@Override
	public String getSourceCode(Relationship r,String sourceCode) {

		System.out.println("hi concrete handler hu main");
		return null;
	}
	
	
}