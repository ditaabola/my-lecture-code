package lv.dita;
import lv.dita.Rectangle;

public class testFigure {
	
	public static void main(String[] args) {
		
	Rectangle rectangle = new Rectangle();
	System.out.println(rectangle.toString());
	
	Rectangle rectangle2 = new Rectangle(0.5f, 0.6f);
	System.out.println(rectangle2);
	
	Rectangle rectangle3 = new Rectangle(0.5f);
	System.out.println(rectangle3);
	
	}
}