package lv.dita.geometricfigures;

public class Circle {
	// final veertiibas nevar tikt mainiitas
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOUR = "red";

	private double radius;
	private String colour;

	public double getArea() {
		return Math.PI * (radius * radius);

	}

	// public String toString(){
	// return "Circle radius is " + radius + " and " + "Circle colour " +
	// colour;
	//
	// }

	public Circle() { // konstruktors
		this.radius = DEFAULT_RADIUS;
		this.colour = DEFAULT_COLOUR;

	}

	@Override
	public String toString() { // automaatiski genereets
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}

	public Circle(double r) { // veel viens konstruktors
		this.radius = r;
		this.colour = DEFAULT_COLOUR;
	}

	public Circle(double r, String c) { // veel viens konstruktors
		this.radius = r;
		this.colour = c;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}