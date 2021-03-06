package lv.dita;

import lv.dita.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {
		Circle figure = new Circle(); // veertiibas jau ir defineetas konstanti, nav jaadefinee atseviski
		Circle figure2 = new Circle(40.2);
		Circle figure3 = new Circle(40.2, "green");
	
		System.out.println(figure.getColour() + " and " + figure.getRadius());
		System.out.println(figure2.getColour() + " and " + figure2.getRadius());
		System.out.println(figure3.getColour() + " and " + figure3.getRadius());
	
		System.out.println("Radius of figure = " + figure.getArea());
		System.out.println("Radius of figure 2 = " + figure2.getArea());
		System.out.println("Radius of figure 3 = " + figure3.getArea());
		
		System.out.println(figure.toString());
		System.out.println(figure2.toString());
		System.out.println(figure3.toString());
	}

}
