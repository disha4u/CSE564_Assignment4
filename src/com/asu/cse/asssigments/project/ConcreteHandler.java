package com.asu.cse.asssigments.project;

class ConcreteHandler implements Handler
{
	protected Handler successor;
	public void setSuccessor(Handler successor)
	{
		this.successor=successor;
	}
	@Override
	public String getSourceCode(Relationship r) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}