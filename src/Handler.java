
/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */

public interface Handler {
	/**
	 * A common methods that all the child of Handler implement for chain of respoinsibilites 
	 * @param Relationship r
	 * @param String     sourceCode
	 * @return String
	 */
	public String getSourceCode(Relationship s,String sourceCode);
}
