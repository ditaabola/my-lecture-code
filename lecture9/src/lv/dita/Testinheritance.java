package lv.dita;

import lv.dita.graph.Point2D;
import lv.dita.graph.Point3D;
import lv.dita.graph.Point4D;

public class Testinheritance {

	public static void main(String[] args) {

		Point2D point1 = new Point2D();
		System.out.println(point1.toString());

		Point2D point11 = new Point2D(1, 4);
		System.out.println(point11.toString());

		Point3D point2 = new Point3D();
		System.out.println(point2.toString());

		Point3D point22 = new Point3D(1, 5, 5);
		System.out.println(point22.toString());
		
		point11.setX(9);
		point11.setY(8);

		System.out.println(point11.toString());
		
		Point4D point3 = new Point4D(1,2,3,4);
		System.out.println(point3);
		}


}
