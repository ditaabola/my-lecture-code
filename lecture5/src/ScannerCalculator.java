import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first floating point number: ");
		double number = sc.nextDouble();
		System.out.println("Enter second floating point number: ");
		double number2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Input operator /+-%: ");
		String operatorSymbol = sc.nextLine();
		double result = 0;
		if(operatorSymbol.equals("+")){
		result = number + number2;
		System.out.println("Test result= " + result);
		}else if(operatorSymbol.equals("-")){
			result = number-number2;
			System.out.println("Test result = " + result);
		}else if(operatorSymbol.equals("/")){
			result = number/number2;
			System.out.println("Test result = " + result);
		}else if(operatorSymbol.equals("*")){
			result = number*number2;
			System.out.println("Test result = " + result);
		}else if(operatorSymbol.equals("%")){
		result = number%number2;
		System.out.println("Test result = " + result);
		}else{
			System.out.println("Operator not correct");
		}
		
		
	}

}
