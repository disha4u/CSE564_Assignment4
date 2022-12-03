/** This class is part of the chain of responsibility
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
class ConcreteHandler implements Handler {
	protected Handler successor;
	
	/**
	 * Set the successor to generate the source Code
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	/**
	 * Method to update the sourceCode
	 */
	@Override
	public String getSourceCode(Relationship r, String sourceCode) {
		return null;
	}

}