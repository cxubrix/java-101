package day9;

public class Triangle extends AbstractColoredShap {

	private String color;

	public Triangle(String color) {
		this.color = color;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 0;
	}

	@Override
	public String getColor() {
		return color;
	}

}
