package day4;

public class ForExample {

	public static void main(String[] args) {

		// basic for loop with increment by 1
		System.out.println("basic for loop with increment by 1");
		for (int i = 0; i < 10; i++) { // prints 1-10
			System.out.println("i: " + i);
		}

		// for loop with no index
		System.out.println("for loop with no index");
		String[] strings = { "abc", "def", "efg" };
		for (String s : strings) { // prints values from array
			System.out.println(s);
		}

		// for loop with increment of 1 but skips code if i is even number
		System.out.println("for loop with increment of 1 but skips code if i is even number");
		for (int oddI = 0; oddI < 10; oddI++) {
			if (oddI % 2 == 0) {
				continue; // jumps right back to start of loop
			}
			System.out.println("oddI: " + oddI);
		}

		// infinite loop broken by using break
		System.out.println("for loop with increment of 1 but skips code if i is even number");
		int c = 10;
		for (;;) { // prints 10-1
			System.out.println("c: " + c);
			c--;
			if (c == 0) {
				break; // exits the loop and jums to the code after loop
			}
		}

		// prints integers from -9 to 9 jumping from middle i.e 1, -1, 2, -2, 3, -3 etc
		System.out.println("prints integers from -9 to 9 jumping from middle i.e 1, -1, 2, -2, 3, -3 etc");
		int jumpFactor = 1; // jump 1 position
		for (int jumpingInt = 1; jumpingInt < 10 && jumpingInt > -10; jumpingInt = jumpingInt + jumpFactor) {
			System.out.println("jumpFactor: " + jumpFactor + ", jumpingInt: " + jumpingInt);
			// update jumpFactor
			jumpFactor = jumpFactor > 0 ? -jumpFactor - 1 : -jumpFactor + 1;
		}

	}

}
