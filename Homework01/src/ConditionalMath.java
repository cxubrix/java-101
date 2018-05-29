import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadi savu vārdu: ");
		String name = scanner.next();

		System.out.print("Ievadi skaitli i: ");
		int i = scanner.nextInt();

		System.out.print("Ievadi skaitli j: ");
		int j = scanner.nextInt();

		scanner.close(); // just close it once you do not need it

		// print info if i is >, < or == to j
		if (i != j) {
			if (i > j) {
				System.out.println("Skaitlis " + i + " ir lielāks par skaitli " + j);
			} else {
				System.out.println("Skaitlis " + j + " ir lielāks par skaitli " + i);
			}
		} else {
			System.out.println("Skaitlis i un j ir vienādi!");
		}

		// print info about name length vs i+j
		int sum = i + j;
		String leadMessage = "Skatiļu i un j summa ir " + sum + " kas ir ";
		String trailMessage = " burtu Tavā vārdā!";

		if (sum == name.length()) {
			System.out.println(leadMessage + "tikpat cik" + trailMessage);
		} else {
			if (sum < name.length()) {
				System.out.println(leadMessage + "mazāk nekā" + trailMessage);
			} else {
				System.out.println(leadMessage + "vairāk nekā" + trailMessage);
			}
		}
	}

}
