package lv.dita;

import java.util.Arrays;
import java.util.Scanner;

public class TestScannerInputArray {

	public static void main(String[] args) {
		System.out.println("Number of users you want to enter");
		Scanner sc = new Scanner(System.in);
		int arrElementCount = sc.nextInt();
		sc.nextLine();
		String[] strArrStrings = new String[arrElementCount];

		System.out.println(strArrStrings.length + " users in array:");

		for (int i = 0; i < strArrStrings.length; i++) {
			strArrStrings[i] = sc.nextLine();
		}

		System.out.println("DO you want to to print array");
		System.out.println("Type (Print) or");
		System.out.println("Type (Not print)");

		String statusCheck = sc.nextLine();

		if (statusCheck.equals("Print")) {
			printArray(strArrStrings);
		} else if (statusCheck.equals("Not print")) {
			System.out.println("EXIT");
		} else {
			System.out.println("You entered it wrong");
		}
	}

	public static void printArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
