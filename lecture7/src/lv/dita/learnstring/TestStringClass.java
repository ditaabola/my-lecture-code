package lv.dita.learnstring;

public class TestStringClass {

	public static void main(String[] args) {

		String str = "   In de x   ";
		String strClass = new String("Index param");

		// System.out.println(str);
		// System.out.println("String like obj " + strClass);
		//
		// int stringLength = str.length();
		// System.out.println(stringLength);
		// System.out.println(str.charAt(4)); //lauj atlasit konretu rakstuzimi
		// pec indeksa
		//
		// System.out.println(str.toLowerCase());
		// System.out.println(str.toUpperCase());
		//
		//
		// System.out.println(str.trim());
		// System.out.println(str.replace(" ", ""));

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		System.out.println(s1 == s2);// salidzina atminas
		System.out.println(s1 == s1);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2)); //salidzina characterus
		System.out.println(s2.equals(s3));
		System.out.println(!s2.equals(s2));
	}

}
