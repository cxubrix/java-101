package day5;
// imports??
public class MathExamples {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		Math.min(a, b); // 5
		Math.max(a, b); // 10
		Math.abs(a - b); // 5

		Math.floor(5.99); // 5.0
		Math.floor(1.01); // 1.0
		
		Math.round(5.99); // 6.0
		Math.round(1.01); // 1.0

		System.out.println(Math.log10((double)b)); // 1.0
		System.out.println(Math.cos(2 * Math.PI)); // 1.0
		System.out.println(Math.toDegrees(Math.PI / 2)); // 180.0

		System.out.println("PI is " + Math.PI);

	}

}
