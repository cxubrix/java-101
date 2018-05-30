import java.util.Random;
import java.util.Scanner;

public class GameWithTimer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random rand = new Random();

		int c = 10;

		for (int i = 0; i < 10; i++) {

			int a = rand.nextInt(c);
			// System.out.print(a);

			int b = rand.nextInt(c);
			// System.out.println(b);

			int operator = rand.nextInt(4);
			// System.out.println(b);

			int result1 = -1;
			int result = -1;

			switch (operator) {
			case 1:
				result = a + b;
				System.out.println(a + "+" + b + "= ");
				result1 = input.nextInt();
				break;
			case 2:
				result = a - b;
				System.out.println(a + "-" + b + "= ");
				result1 = input.nextInt();
				break;

			case 3:
				result = a * b;
				System.out.println(a + "*" + b + "= ");
				result1 = input.nextInt();
				break;
			case 4:
				result = a / b;
				System.out.println(a + "/" + b + "= ");
				result1 = input.nextInt();
				break;
			default:
				break;
			}

			if (result == result1) {
				System.out.println("correct");
			} else {
				System.out.println("wrong");
			}

		}

	}

}