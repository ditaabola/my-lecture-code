public class Calculator {

	public static void main(String[] args) {
		double num = 1.50d;
		double num1 = 2.0d;
		double result;
		char operatorMath = '+';
		if (operatorMath == '+') {
			result = num + num1;
			System.out.println(result);
		} else if (operatorMath == '-') {
			result = num - num1;
			System.out.println(result);
		} else if (operatorMath == '*') {
			result = num * num1;
			System.out.println(result);
		} else if (operatorMath == '/') {
			result = num / num1;
			System.out.println(num / num1);
		} else if (operatorMath == '%') {
			if (num >= num1) {
				result = num % num1;
				System.out.println(result);
			} else {
				System.out.println("Wrong data");
			}
		} else {
			System.out.println("WRONG DATA");

		}
		System.out.println("---------------------------------------");

		switch (operatorMath) {
		case '+':
			result = num + num1;
			System.out.println(result);
			break;
		case '-':
			result = num - num1;
			System.out.println(result);
			break;
		case '*':
			result = num * num1;
			System.out.println(result);
			break;
		case '/':
			result = num / num1;
			System.out.println(result);
			break;
		case '%':
			result = num % num1;
			if (num > num1) {
				System.out.println(result);

			} else {
				System.out.println("If" + " " + num + " is less then" + " "
						+ num1 + " result is" + " " + num);			}
			break;
		default:
			System.out.println(" NO such operator");
		}
	}
}
