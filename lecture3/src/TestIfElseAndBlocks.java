public class TestIfElseAndBlocks {

	public static void main(String[] args) {
		System.out.println("**************");
		System.out.println("**************");

		boolean test = true;
		int result;
		if (test) {
			int number = 100; // sis mainigais darbojas tikai konkretaja bloka
			System.out.println("True");

			result = number + number;
			System.out.println("Result value is" + " " + result);

		} else {
			System.out.println("False");
		}
		System.out.println("AFTER if another block");

		boolean test2 = false;

		if (test2) {
			System.out.println("False");
			int number = 200;
			result = number + number;
			System.out.println("Result value is" + " " + result);
		} else {
			System.out.println("False");
		}
		System.out.println("AFTER if another block");
	}
}
