package lv.dita.repeatarray;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[3];
//		System.out.println("Enter an integer: ");
//		arr[0] = sc.nextInt();
//		System.out.println("Enter another integer: ");
//		arr[1] = sc.nextInt();
//		System.out.println("Enter one more integer: ");
//		arr[2] = sc.nextInt();
//		System.out.println("You entered an array of integers: " + arr[0] + " "
//				+ arr[1] + " " + arr[2]);
//		sc.close();

		Scanner sc2 = new Scanner(System.in);
		System.out
				.println("Enter number of array elements you want to input: ");
		int n = sc2.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc2.nextInt();
			System.out.print("You listed these numbers: " Arrays.toString);
			
		}
		}

}
