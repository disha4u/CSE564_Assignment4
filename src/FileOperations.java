


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Ramachandra Sai
 * @author Disha Agarawal
 * @author Harshit
 * @author Chandana
 * @author Vinay
 * @author Karthikeya
 */
public class FileOperations {
	/**
	 * Gets the file from the filchooser to load
	 * @return File
	 */
	public File getFilePath() {
		
		try {
			JFileChooser jFileChooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
			jFileChooser.addChoosableFileFilter(filter);
			jFileChooser.showOpenDialog(null);
			File file = jFileChooser.getSelectedFile();
			return (file);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Makes the text file which contains all the relations and classes
	 * @param fname
	 */
	public void tofile(String fname) {
		try {
			Storage bb = Storage.getInstance();
			FileWriter writer = new FileWriter(fname);
			String str;
			int i;
			writer.write("Classes" + System.lineSeparator());
			for (i = 0; i < bb.getclasssize(); i++) {

				str = bb.readclass(i).toString();

				writer.write(str + System.lineSeparator());
			}
			writer.write("Relationships" + System.lineSeparator());
			for (i = 0; i < bb.getrelationshipsize(); i++) {

				str = bb.readrelationship(i).toString();
				writer.write(str + System.lineSeparator());
			}
			writer.close();
		} catch (Exception e) {

		}
	}
	/**
	 * reads the file and creates relationships and classes
	 * @param file
	 */
	public void fromfile(File file) {
		try {
			Storage bb = Storage.getInstance();
			// File myObj = new File(fname);
			Scanner myReader = new Scanner(file);
			int i = 0;
			while (myReader.hasNextLine()) {

				String line = myReader.nextLine();
				if (i == 0) {
					i++;
					continue;
				}
				if (line.startsWith("Relationships"))
					break;

				String[] s = line.split(",", 3);
				Objects o = new Objects(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2]));

				bb.addclass(o);

				i++;

			}
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String[] s = line.split(",", 3);
				Relationship r;
				r = new Relationship(s[2], s[0], s[1]);

				// System.out.println(r.toString());
				bb.addrelationship(r);

			}
			myReader.close();
		} catch (Exception e) {
			System.out.println("file not found" + e);
		}
	}
	/**
	 * Clear the data present in the storage and clears the screen
	 */
	public void New() {
		Storage s = Storage.getInstance();
		s.cleardata();
	}
}
