import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadi savu vārdu: ");
		String name = scanner.next();
		System.out.print("Ievadi savu vecumu: ");
		int age = scanner.nextInt();
		scanner.close(); // just close it once you do not need it
		System.out.println("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns/jauna!");
	}

}
