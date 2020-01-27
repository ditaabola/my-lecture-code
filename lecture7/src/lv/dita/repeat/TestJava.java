package lv.dita.repeat;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputvalue = 0;
		
		System.out.println("Please enter an integer: ");
		if (!sc.hasNextInt()) {
			System.out.println("You did not enter an integer");

		} else {
			int number = 0;
			inputvalue = sc.nextInt();
			System.out.println("You entered: " + number);
		
			}
		}
	}			

		
	

