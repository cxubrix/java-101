package day3;

public class StringOperations {

	public static void main(String[] args) {

		// define string
		String str = "ABC"; // ABC

		// update str with newly created string and concat d to it
		str = str.concat("d"); // ABCd

		// update str with newly created string and concat e to it (same as above but
		// different syntax)
		str = str + "e"; // ABCde

		System.out.println(str.toLowerCase()); // abcde
		System.out.println(str.toUpperCase()); // ABCDE
		System.out.println(str.substring(3)); // de
		System.out.println(str.substring(1, 3)); // BC
		System.out.println(str.length()); // 5
		System.out.println(str.contains("d")); // true
		System.out.println(str.contains("D")); // false
		System.out.println(str.equals("ABCde")); // true
		System.out.println(str.equals("abcde")); // flase
		System.out.println(str.equalsIgnoreCase("abcde")); // true
		System.out.println(str.indexOf("C")); // 2
		System.out.println(str.startsWith("AB")); // true
		System.out.println(str.startsWith("BC")); // false
		System.out.println(str.startsWith("BC", 1)); // true
		System.out.println(str.charAt(3)); // d
		System.out.println(str.isEmpty()); // false
		System.out.println(str.compareTo("BCDEF")); // -1
		System.out.println(str.compareTo("01234")); // 17
		System.out.println(str.compareTo("ABCde")); // 0
		System.out.println(str.compareToIgnoreCase("bcde")); // -1
		System.out.println(str.compareToIgnoreCase("abcde")); // 0
		System.out.println(str.indexOf("A", 1)); // -1
	}

}
