package day6;

import java.util.ArrayList;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i = 10;
		int z = 100;
		int m = 77;
		arrayList.add(i);
		arrayList.add(z);
		arrayList.add(1,m);
		
		System.out.println("arrayList: " + arrayList); // 10, 77, 100
		System.out.println("arrayList size: " + arrayList.size()); // 3

		arrayList.remove(1); // remove object at position 1
		System.out.println("arrayList: " + arrayList);
		System.out.println("arrayList size: " + arrayList.size()); // 2

		int value = (int) arrayList.get(1);
		System.out.println("value[1]: " + value);


		ArrayList<Integer> otherArrayList = new ArrayList<>(arrayList);
		otherArrayList.add(1234567);
		System.out.println("otherArrayList: " + otherArrayList.size());
		System.out.println("otherArrayList after addAll: " + otherArrayList.size());
		
		Integer integer = (Integer) 555;
		otherArrayList.add(0, integer); // add at position zero
		
		
		System.out.println("otherArrayList: " + otherArrayList);

		otherArrayList.set(1, 200); // replace object at position 1
				
		System.out.println("otherArrayList: " + otherArrayList);
		
		otherArrayList.clear(); // remove all elements from the list
		System.out.println("otherArrayList size: " + otherArrayList.size());


	}
	
}
