package lv.dita.inputoutput;

import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Data.txt");

		int i;
		char test = 101;
		
		System.out.println(test);

		while ((i = fr.read()) != -1) {
			System.out.print((char) i); // liks savu char sava rindinaa, lai nebutu, jaliek print, nevis println
		}
	}

}
