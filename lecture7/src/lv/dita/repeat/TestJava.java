package lv.dita.repeat;

import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {
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
	
				
			}
		}
	}			

		
	

