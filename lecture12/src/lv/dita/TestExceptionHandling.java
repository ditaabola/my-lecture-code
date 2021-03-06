package lv.dita;

public class TestExceptionHandling {

	public static void main(String[] args) {
		try {

			int number1 = 10;
			int number2 = 0;
			int result = number1 / number2;

			System.out.println(result);
		} catch (Exception e) { // Exception ir tips, mainiigaa nosaukumu var
								// dot, kaadu grib
			System.out.println("Check code in try block: " + e);

		}
		try {
			int[] myNumbers = { 1, 2, 3, 4, 5 };
			System.out.println(myNumbers[3]);

		} catch (Exception e) {
			System.out.println("Error in array: " + e);
		} finally { // izpilda darbiibu jebkura gadijumaa, ja ir errori
			System.out.println("The try catch block is finished");
		}
	}
}
