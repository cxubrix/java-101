import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {

		// get user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadi veselu skaitli: ");
		int i = scanner.nextInt();
		System.out.print("Ievadi decimālskaitli: ");
		double d = scanner.nextDouble();
		scanner.close(); // just close it once you do not need it

		// do some math
		double sum = i + d;
		double sub = i - d;
		double div = i / d;
		double mul = i * d;
		double sqSum = sum * sum;

		// print out results
		String leadingText = "Skaitļu " + i + " un " + d; // we will use it multiple times
		System.out.println(leadingText + " summa ir: " + sum);
		System.out.println(leadingText + " starpība ir: " + sub);
		System.out.println(leadingText + " dalījums ir: " + div);
		System.out.println(leadingText + " reizinājums ir: " + mul);
		System.out.println(leadingText + " summa kvadrāts ir: " + sqSum);

	}

}
