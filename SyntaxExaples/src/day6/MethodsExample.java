package day6;

import java.util.Scanner;

public class MethodsExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// long syntax
		String line = getString(sc, "5", "20");
		boolean resultLong = between(line, 5, 20);
		printResult(resultLong);

		// get input, check, print out result
		printResult(between(getString(sc, "1", "5"), 1, 5));

	}

	public static String getString(Scanner scanner, String min, String max) {
		System.out.println("Enter number that is between " + min + " and " + max);
		String line = scanner.nextLine();
		return line;
	}

	public static void printResult(boolean isCorrect) {
		if (isCorrect) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
	}

	public static boolean between(String input, int min, int max) {
		boolean result = input.length() > min && input.length() < max;
		return result;
	}

}
