package day2;

public class IfElseExamples {

	public static void main(String[] args) {

		// define variables
		int x = 10;
		int y = 4;

		// if
		if (x > y) {
			System.out.println("x is greater than y");
		}

		// if - else
		if (x == y) {
			System.out.println("x and y are equal"); // will never happen with x = 10 and y = 4
		} else {
			System.out.println("x and y are not equal");
		}

		// if - else if - else
		if (x < y) {
			System.out.println("x is less than y");
		} else if (x > y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("x and y are equal");
		}

		// multiple else if blocks, executes until first else-if block is true of falls
		// back to else block
		// prints x is greater than 9
		if (x > 11) {
			System.out.println("x is greater than 11");
		} else if (x > 9) {
			System.out.println("x is greater than 9");
		} else if (x > 7) {
			System.out.println("x is greater than 7");
		} else if (x > 5) {
			System.out.println("x is greater than 5");
		} else if (x > 3) {
			System.out.println("x is greater than 3");
		} else if (x > 1) {
			System.out.println("x is greater than 1");
		} else {
			System.out.println("x is equal or less than 1");
		}

		// logical operators
		if (x < 9 && y > 3) { // logical AND
			System.out.println("x is less than 9 AND y is greater than 3");
		}

		if (x > 5 || y > 5) { // logical OR
			System.out.println("x OR y is greater than 5");
		}

		if (!(x == y)) { // logical NOT
			System.out.println("x and y are equal NOT");
		}

		if (!(x != y)) { // logical NOT
			System.out.println("x and y are different NOT");
		}

		// short if syntax 'Elvis' syntax
		int maxValue = x > y ? x : y; // assign x or y to maxValue variable depending of (x>y) outcome
		System.out.println("maxValue is " + maxValue);

	}

}
