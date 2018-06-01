package day6;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListWithString {

	public static void main(String[] args) {
		Integer integer = (Integer) 123;
		String str = "String_1";
		String str2 = "String_2";

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("" + integer);
		arrayList.add("abc");
		for (int i = 0; i < new Random().nextInt(4); i++) {
			arrayList.add("abc" + i);
		}
		arrayList.add(str);

		arrayList.add("def");

		System.out.println("arrayList: " + arrayList);

		boolean contains = arrayList.contains(str); // check if list contains str object
		System.out.println("contains: " + contains);
		int position = arrayList.indexOf(str); // get index of str object
		System.out.println("position: " + position + ", value: " + arrayList.get(position));
		
		boolean isEmpty = arrayList.size() == 0; // check if list has any elements
		System.out.println("size == 0: " + isEmpty);
		
		isEmpty = arrayList.isEmpty(); // short syntax for checking if list is empty
		System.out.println("isEmpty(): " + isEmpty);

		int position2 = arrayList.indexOf(str2); // check for str2
		System.out.println("position2: " + position2);

		if (position2 != -1) {
			System.out.println("position2: " + position2 + ", value2: " + arrayList.get(position2));
		}

	}

}
