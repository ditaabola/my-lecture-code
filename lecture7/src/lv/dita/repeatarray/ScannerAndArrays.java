package lv.dita.repeatarray;

import java.util.Scanner;

public class ScannerAndArrays {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[3];
	System.out.println("Enter an integer: ");
	arr[0]  = sc.nextInt();
	System.out.println("Enter another integer: ");
	arr[1]  = sc.nextInt();
	System.out.println("Enter one more integer: ");
	arr[2] = sc.nextInt();
	System.out.println("You entered an array of integers: " +arr[0] + " " + arr[1]+" " + arr[2]);
	
	
	
	
	}

}
