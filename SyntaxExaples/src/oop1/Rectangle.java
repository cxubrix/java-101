package oop1;

public class Rectangle {

	int width;
	int height;

	public Rectangle() {
	}

	public Rectangle(int size) {
		width = size;
		height = size;
	}

	public Rectangle(int h, int w) {
		width = w;
		height = h;
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

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
