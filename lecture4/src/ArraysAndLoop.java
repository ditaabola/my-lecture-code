import java.util.Arrays;

public class ArraysAndLoop {

	public static void main(String[] args) {
		// Declare variable
		int[] marks = { 76, 23, 42, 199, 99, 10, 56 };
		// Make to String all elements ofArray
		// Print to console
		System.out.println("[" + marks[0] + ", " + marks[1] + ", " + marks[2]
				+ ", " + marks[3] + ", " + marks[4] + ", " + marks[5] + ", "
				+ marks[6] + "]");
		System.out.println(Arrays.toString(marks));

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]); // vienkarsi out.print visu liek viena
										// linija
		}

		System.out.print("[");
		for (int i = 0; i < marks.length - 1; i++) {
			System.out.print(marks[i] + ", ");
		}
		System.out.print(marks[marks.length - 1] + "]");

		// "\n" - jauna linija
		
		System.out.print("\n"+ marks.length);
	}

}
