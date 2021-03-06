package lv.dita.interf;

public class Rectangle implements Shape {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = length;

	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		return width*length;
	}
	
}
