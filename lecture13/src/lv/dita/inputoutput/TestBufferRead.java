package lv.dita.inputoutput;

import java.io.*;

public class TestBufferRead {

	public static void main(String[] args) throws Exception {
		File file = new File("Data.txt");
		FileReader filReader = new FileReader(file);
		BufferedReader buffReader = new BufferedReader(filReader); //prasa obligaati ielikt kaut kaadu objektu
		
		String stringFileData;
		
		while((stringFileData = buffReader.readLine()) != null){ //paarbauda, vai nav tukss dokuments
		System.out.println(stringFileData);
		}
	}

}
