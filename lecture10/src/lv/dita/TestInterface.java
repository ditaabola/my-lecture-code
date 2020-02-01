package lv.dita;

import lv.dita.interf.Rectangle;
import lv.dita.interf.Shape;
import lv.dita.interf.Triangle;

public class TestInterface {

	public static void main(String[] args) {

	Shape figure = new Rectangle(3, 4);
	System.out.println(figure.toString());
	System.out.println("The area of the rectangle is "+ figure.getArea());
	
	Shape figure2 = new Triangle(4, 7);
	System.out.println(figure2.toString());
	System.out.println(figure2.getArea());
	}
}
