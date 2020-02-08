package lv.dita.inputoutput;

import java.io.File;

public class TestFiles {

	public static void main(String[] args) {

		File myFile = new File("Data.txt");
		String path = myFile.getAbsolutePath(); // var saprast, kur jaieliek
												// fails, lai vins failu atrastu
		System.out.println(path);
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead()) {
				System.out.println(myFile + " ok to read");
			} else {
				System.out.println(myFile + " not ok to read");
			}

			if (myFile.canWrite()) {
				System.out.println(myFile + " ok to write");
			} else {
				System.out.println(myFile + " not ok to write");
			}
		} else {
			System.out.println("File not found");
		}
	}

}
