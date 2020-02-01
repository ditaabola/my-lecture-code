package lv.dita.interf;

public class Triangle implements Shape {
	private int base;
	private int height;

	public Triangle(int base, int heigth) {
		this.base = base;
		this.height = heigth;

	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}