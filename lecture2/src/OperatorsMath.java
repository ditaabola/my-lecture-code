
public class OperatorsMath {
	public static void main(String[] args) {
		double num1 = 5.4d;
		double num2 = 0.3d;
		double result;
		double result1;
		double result2;
		double result3;
		char add ='+';
		char subtract = '-';
		char multiply ='*';
		char divide ='/';
		result = num1 + num2;
		result1 = num1 - num2;
		result2 = num1 * num2;
		result3 = num1 / num2;
		//pedinas ir tapec, lai butu smukak - atstarpe
		System.out.println(num1 + " "+add+" "+num2+" = "+result);
		System.out.println();
		System.out.println(num1 + " "+subtract+" "+num2+" = "+result1);
		System.out.println();
		System.out.println(num1 + " "+multiply+" "+num2+" = "+result2);
		System.out.println();
		System.out.println(num1 + " "+divide+" "+num2+" = "+result3);
		System.out.println();
		
		int a = 12;
		int b = 1;
		int x = a % b;
		System.out.println("x = "+x);
		//increment funkcija (vispirms jaliek plusini)
		int i = 0;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return incremented result
		int p = ++k;
		System.out.println("p after increment: "+p);

		p = k++;
		System.out.println("p after increment: "+p);
		
		int o = 2;
		int f = o++;
		System.out.println("f after increment: "+f);
	}

}
