import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		// Scanner - ta ir klase, new - tas ir keywords
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");

		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();

		System.out.println("Your number is " + number);
		System.out.println("Your name is " + name);
		


	}

}
