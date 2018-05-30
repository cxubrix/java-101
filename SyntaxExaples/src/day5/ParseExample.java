package day5;

import java.util.Scanner;

public class ParseExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a  number: ");
		String numberLine = sc.nextLine();

		System.out.print("Enter a double: ");
		String doubleLine = sc.nextLine();

		System.out.print("Enter a boolean (true/false): ");
		String booleanLine = sc.nextLine();

		sc.close();

		System.out.println("You entered: '" + numberLine + "' as number");
		System.out.println("You entered: '" + doubleLine + "' as double");
		System.out.println("You entered: '" + booleanLine + "' as boolean");
		System.out.println();

		int i = Integer.parseInt(numberLine); // parse input to int
		double d = Double.parseDouble(doubleLine); // parse input to double
		boolean b = Boolean.parseBoolean(booleanLine); // parse input to boolean

		System.out.println("number " + i + " squered is " + i * i);
		System.out.println("double " + i + " rounded " + Math.round(d));
		System.out.println("boolean " + b + " inverted is " + !b);

	}

}
