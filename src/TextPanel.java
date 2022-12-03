


import java.io.FileWriter;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 */
public class TextPanel implements Observer, Runnable {
	Storage storage = Storage.getInstance();
	JTextArea writable;

	/**
	 * sets JTextArea which is passed from main
	 * @param JTextArea object
	 */
	TextPanel(JTextArea writable) {
		this.writable = writable;
	}

	/**
	 * Updates the code, accesses the singleton storage.
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

		String code = "";

		Relationship r;
		InheritanceHandler ih = new InheritanceHandler();
		CompositionHandler ch = new CompositionHandler();
		AssociationHandler ah = new AssociationHandler();

		ih.setSuccessor(ch);
		ch.setSuccessor(ah);

		int i;
		for (i = 0; i < storage.getclasssize(); i++) {
			Objects currentClass = storage.readclass(i);
			String className = currentClass.getname();
			code += "class " + className + "{\n}\n";
		}

		for (i = 0; i < storage.getrelationshipsize(); i++) {
			r = storage.readrelationship(i);
			code = ih.getSourceCode(r, code);

		}

		writable.setText(code);
		writable.setVisible(true);

	}

	/**
	 * Updates the code
	 * @param Observable object
	 */
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		run();
	}
}
