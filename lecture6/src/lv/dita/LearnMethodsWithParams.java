package lv.dita;

public class LearnMethodsWithParams {

	public static void main(String[] args) {
		double radius = 30.2;
		String colour = "red";

		int result = getArea(radius);
		double result2 = getAreaForCircle(radius);
		System.out.println("Area is: " + result2);
		System.out.println("Area of the circle is: " + result2);
		System.out.println(getColourAndArea(colour, result));
	}

	// casting - metode var but viens tips, bet ieksa var stradat ar doubliem,
	// tad ir japasaka, kadu tipu vajag beigas
	public static int getArea(double radius) {
		double result = Math.PI * (radius * radius);
		return (int) result;
	}

	public static double getAreaForCircle(double radius) {
		double result2 = Math.PI * (radius * radius);
		return result2;
	}

	public static String getColourAndArea(String colour, double area) {
		return "Colour " + colour + " and " + area;
	}




}