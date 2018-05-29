import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet vārdu un uzvārdu: ");
		String input = sc.nextLine();
		sc.close();

		int spaceIndex = input.indexOf(' ');

		if (spaceIndex > 0) {
			String name = input.substring(0, spaceIndex);
			name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			
			String surname = input.substring(spaceIndex + 1).toUpperCase();
			
			System.out.println("'" + name + "'");
			System.out.println("'" + surname + "'");
		} else {
			System.out.println("Not valid input");
		}

	}
}