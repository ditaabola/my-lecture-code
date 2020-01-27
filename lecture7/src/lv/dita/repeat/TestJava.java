package lv.dita.repeat;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner sc = new Scanner(System.in);
		int inputvalue = 0;
		
		System.out.println("Please enter an integer: ");
		if (!sc.hasNextInt()) {
			System.out.println("You did not enter an integer");

		} else {
			int number = 0;
			inputvalue = sc.nextInt();
			System.out.println("You entered: " + number);
		
=======
		Scanner input = new Scanner(System.in);
		System.out.println("Input value: ");
		int inputvalue;
		inputvalue = input.nextInt();
		System.out.println("Your input value is " + inputvalue);
	
		if(!(input.hasNextInt())){
			System.out.println("Input integer ");
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		if (!sc.hasNextInt()) {
			System.out.println("You did not enter an integer");
			
		} else {
			int number = 0;
			number = sc.nextInt();
			System.out.println("You entered: " + number);
	
				
>>>>>>> 85d8e79290f4b1d9448b54d7320a5f25ecbe2dab
			}
		}
	}			

		
	

