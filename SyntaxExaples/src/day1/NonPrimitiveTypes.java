package day1;

import java.util.Scanner;

public class NonPrimitiveTypes {

	public static void main(String[] args) {

		String s = "abc"; // define a variable named s of type String with inital value abc
		int[] intArray = { 1, 2, 3, 4 }; // define array of ints with 4 values 1,2,3,4
		String[] stringArray = { "ABC", "DEF", "EGH" }; // define array of Strings with 3 values in it

		int[] intArrayEmpty = new int[5]; // define empty ints array with size of 5
		String[] stringArrayEmpty = new String[3]; // define empty ints array with size of 3

		Object ourObject = new Object(); // define new object instance with name ourObject of class Object
		Scanner ourScanner = new Scanner(System.in); // define new object instance of type Scanner with name ourScanner
		ourScanner.close(); // close ourScanner object 
	}

}
