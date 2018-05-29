import java.util.Scanner;

public class HelloUserAdv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet vārdu un uzvārdu: ");
		String input = sc.nextLine();
		sc.close();

		// remove leading and trailing spaces
		input = input.trim();

		int spaceIndex = input.indexOf(' '); // check for first space char in remaining string

		if (spaceIndex > 0) {
			String name = input.substring(0, spaceIndex);
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

			String surname = input.substring(spaceIndex).trim().toUpperCase();
			if (surname.contains(" ")) { // case of 2 surnames
				int firstSpace = surname.indexOf(" ");
				surname = surname.substring(0, surname.indexOf(" ")) + "-" + surname.substring(firstSpace).trim();
			}
			// TODO implement case with more than 2 surnames
			
			
			System.out.println("'" + name + "'");
			System.out.println("'" + surname + "'");
		} else {
			System.out.println("Not valid input");
		}

	}
}
