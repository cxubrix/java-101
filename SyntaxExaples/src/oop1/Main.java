package oop1;

public class Main {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(5, 4);
		System.out.println("isSquere: " + rec1.isSquere());
		System.out.println("area: " + rec1.area());
		System.out.println("perimeter: " + rec1.perimeter());
		System.out.println(rec1);
		System.out.println();

		Rectangle rec2 = new Rectangle(3, 8);
		System.out.println("isSquere: " + rec2.isSquere());
		System.out.println("area: " + rec2.area());
		System.out.println("perimeter: " + rec2.perimeter());
		System.out.println(rec2);
		System.out.println();

		Rectangle rec3 = new Rectangle(6);
		System.out.println("isSquere: " + rec3.isSquere());
		System.out.println("area: " + rec3.area());
		System.out.println("perimeter: " + rec3.perimeter());
		System.out.println(rec3);

	}

}
