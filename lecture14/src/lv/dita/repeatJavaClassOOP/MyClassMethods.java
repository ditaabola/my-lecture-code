package lv.dita.repeatJavaClassOOP;

public class MyClassMethods {

	public MyClass myClass; // paskatiities par dazaadiem datu tipiem, ko var
							// izmantot kaa mainiigos. Nee, nevar, jaataisa
							// objekti, pasniedzeeja kluuda;

	public static void myMethod() {
		System.out.println("Hello everybody");
	}

	public String myStringMethod() {
		return "Hello";

	}

	public char returnChar(int a, int b) {
		int charFromInt = a + b;
		char charVariable = (char) charFromInt;
		return charVariable;
	}
}
