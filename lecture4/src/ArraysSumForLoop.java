public class ArraysSumForLoop {

	public static void main(String[] args) {
		int[] marks = { 76, 23, 42, 10, 56, 75 };
		// Sum all values in arrays
		// Print on console
		// System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5]);
		//
		// int result = 10;
		// System.out.println("result value: "+result);
		//
		// int testInt = 90;
		// result = testInt;
		// System.out.println("result value: "+result);
		
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("Sum of marks: " + sum);

		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest += 220; //tas pats, kas sumTest = sumTest + 220;
		sumTest += 240; //tas pats, kas sumTest = sumTest + 240;
		System.out.println("Testing += operator: " + sumTest);
	
		int subtratTest = 100;
		subtratTest = subtratTest-20;
		subtratTest -= 20;
		subtratTest -=30;
		System.out.println("Testing -= operator: " + subtratTest);
		
		int divTest = 100;
		divTest /= 2;
		divTest /= 2;
		divTest /= 5;
		System.out.println("Testing /= operator: " + divTest);
		
		int remainTest = 3;
		remainTest %= 11;
		remainTest %= 2;
		remainTest %= 5;
		System.out.println("Testing %= operator: " + remainTest);
	}
}