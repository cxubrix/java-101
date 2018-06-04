package oop2;

public class Rectangle {

	private int width;
	private int height;
	private Units units;

	public Rectangle() {
		this(0, Units.Millimeters);
	}

	public Rectangle(int size) {
		this(size, Units.Millimeters);
	}

	public Rectangle(int size, Units units) {
		this(size, size, units);
	}

	public Rectangle(int h, int w) {
		this(h, w, Units.Millimeters);
	}

	public Rectangle(int h, int w, Units units) {
		width = w;
		height = h;
		this.units = units;
	}

	public boolean isSquere() {
		return width == height;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return 2 * (width + height);
	}
	
	public Units getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", units=" + units + "]";
	}

}
