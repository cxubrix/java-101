package day1;

public class PrimitiveTypes {

	public static void main(String[] args) {

		// numeric
		int i = 1; // define int type variable named i with initial value 1
		long l = 987654321L; // define long l with initial value 987654321, the L here is optional since we
								// define the type
		double d = 10.5033333; // define double d with value 10.5033333
		float f = 1.5f;

		char c = 'a'; // define char named c with value 'a'
		boolean b = true; // define boolean type variable with value true

		// print out defined variables
		System.out.println("i: " + i); // i: 1
		System.out.println("l: " + l); // l: 987654321
		System.out.println("d: " + d); // d: 10.5033333
		System.out.println("f: " + f); // f: 1.5
		System.out.println("c: " + c); // c: a
		System.out.println("b: " + b); // b: true

		System.out.println("int max: " + Integer.MAX_VALUE); // int max: 2147483647
		System.out.println("int min: " + Integer.MIN_VALUE); // int min: -2147483648
		System.out.println("long max: " + Long.MAX_VALUE); // long max: 9223372036854775807
		System.out.println("long min: " + Long.MIN_VALUE); // long min: -9223372036854775808
		System.out.println("double max: " + Double.MAX_VALUE); // double max: 1.7976931348623157E308
		System.out.println("double min: " + Double.MIN_VALUE); // double min: 4.9E-324
		System.out.println("float max: " + Float.MAX_VALUE); // float max: 3.4028235E38
		System.out.println("float min: " + Float.MIN_VALUE); // float min: 1.4E-45

	}
}
