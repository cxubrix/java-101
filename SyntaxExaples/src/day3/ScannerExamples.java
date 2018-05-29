package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) throws FileNotFoundException {

		// create a new File object which points to file.txt
		File file = new File(ScannerExamples.class.getClassLoader().getResource("day3/file.txt").getFile());

		// create a new instance of Scanner class called fileScanner which reads from a file object
		Scanner fileScanner = new Scanner(file);
		

		// create a new instance of Scanner class called consoleScanner which reads from
		// System.in - console
		Scanner consoleScanner = new Scanner(System.in);
		
		
		String question1 = fileScanner.nextLine();
		System.out.println(question1);
		String name = consoleScanner.nextLine();
		
		String question2 = fileScanner.nextLine();
		System.out.println(question2);
		int age = consoleScanner.nextInt();

		
		String question3 = fileScanner.nextLine();
		System.out.println(question3);
		String acceptCookies = consoleScanner.next();
		fileScanner.close();
		consoleScanner.close();
		
		// normalize data
		name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();		
		boolean hasAcceptetCookies = acceptCookies.equals("y") ? true : false;
		System.out.println("Thanks! Your name is " + name + " and your age is " + age + " you accepted cookies: " + hasAcceptetCookies);
		
		
		consoleScanner.close();
	}

}
