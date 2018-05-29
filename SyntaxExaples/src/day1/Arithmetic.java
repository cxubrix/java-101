package day1;

public class Arithmetic {

	public static void main(String[] args) {

		// define variables
		int x = 10;
		int y = 4;
		double d = 1.5;

		// print out initial values
		System.out.println("x = " + x); // x = 10
		System.out.println("y = " + y); // y = 4
		System.out.println("d = " + d); // d = 1.5

		// print results of arithmetic operations
		System.out.println("x + y = " + (x + y)); // x + y = 14
		System.out.println("x - y = " + (x - y)); // x - y = 6
		System.out.println("x * y = " + (x * y)); // x * y = 40
		System.out.println("x / y = " + (x / y)); // x / y = 2
		System.out.println("x % y = " + (x % y)); // x % y = 2
		System.out.println("x++ is " + (x++)); // x++ is 10
		System.out.println("x-- is " + (x--)); // x-- is 11
		System.out.println("x >> 2 is " + (x >> 2)); // x >> 2 is 2
		System.out.println("y << 2 is " + (y << 2)); // y << 2 is 16

		// arithmetic with int and double
		System.out.println("x / (double) y = " + (x / (double) y)); // x / (double) y = 2.5
		System.out.println("x / d = " + (x / d)); // x / d = 6.666666666666667

	}

}
