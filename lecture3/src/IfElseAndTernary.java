public class IfElseAndTernary {

	public static void main(String[] args) {
		// Ternary operator "?"
		boolean test = true;

		if (test) {
			System.out.println("TEST PASS TRUE");
		} else {
			System.out.println("TEST PASS FAIL");
		}

		String res = (test) ? "TEST PASS TRUE" : "TEST PASS FAIL";
		System.out.println(res);

		int num = 5;
		int num1 = 10;
		int result;

		result = (num < num1) ? (num + num1) : (num - num1);
		//variable = (condition) ? return true: return false;
		System.out.println(result);

	}

}
