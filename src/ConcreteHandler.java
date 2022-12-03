


/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
class ConcreteHandler implements Handler {
	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	@Override
	public String getSourceCode(Relationship r, String sourceCode) {

		System.out.println("hi concrete handler hu main");
		return null;
	}

}