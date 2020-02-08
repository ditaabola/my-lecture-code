package lv.dita.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestReadFile {

	public static void main(String[] args) {
		InputStream inputStream;
		OutputStream outputStream;
		int c;
		final int E0F = -1; // nosaciijums integeriem, jaabut 0 vai 1 un attieciigi paarbauda, vai taa ir

		outputStream = System.out;

		try {
			File inputFile = new File("Data.txt");
			inputStream = new FileInputStream(inputFile); // konstruktors
			try {
				while ((c = inputStream.read()) != E0F) {
					outputStream.write(c);
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				try {
					inputStream.close();
					outputStream.close();
				} catch (IOException e) {
					System.out.println("File did not close");
				} 
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
