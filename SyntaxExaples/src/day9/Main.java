package day9;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Triangle triangle = new Triangle("Yellow");

		Shape[] shapes = new Shape[9];

		double areaCirle = getShapeArea(circle);
		double areaTriangle = getShapeArea(triangle);
		System.out.println("areaCirle: " + areaCirle);

	}

	public static double getShapeArea(Shape s) {
		return s.area();
	}

}
