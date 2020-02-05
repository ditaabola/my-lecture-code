package lv.dita;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Time in my machine: " + myDateObj);

		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String formattedDate = myDateObj.format(myFormat);
		System.out.println("Time in my machine after formatting: "
				+ formattedDate);

	}

}
