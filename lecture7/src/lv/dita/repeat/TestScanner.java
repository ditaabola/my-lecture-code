package lv.dita.repeat;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		final double TAX_RATE_20K = 0.1;
		final double TAX_RATE_30K = 0.2;
		final double TAX_RATE_40K = 0.3;
		final int SENTINEL = -1;
		
		int taxableIncome;
		double taxPayable;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your taxable income in EUR: ");
		taxableIncome =sc.nextInt();
		
		while(taxableIncome!=SENTINEL){
			if(taxableIncome<=20000){
				taxPayable = taxableIncome*TAX_RATE_20K;
				System.out.println("Your tax is: " + taxPayable);
			}else if(taxableIncome>=40000){
				taxPayable = taxableIncome*TAX_RATE_40K;
				System.out.println("Your tax is: "+ taxPayable);
			}else if (taxableIncome<40000 && taxableIncome>20000){
				taxPayable = taxableIncome*TAX_RATE_30K;
				System.out.println("Your tax is: "+ taxPayable);
				taxableIncome =sc.nextInt();
			}else{
				taxPayable = 0;
			}
	
			System.out.println("End");
			taxableIncome =sc.nextInt();
			
					Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Please enter an integer: ");
		while(!sc.hasNextInt()) {
			System.out.println("You did not enter an integer");
			number = sc.nextInt();
					System.out.println("You entered: " + number);

			
		}
			
		}
		
		}
