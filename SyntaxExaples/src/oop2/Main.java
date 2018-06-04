package oop2;

import oop2.utils.UnitUtils;

public class Main {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(50, 40, Units.Centimeters);
		System.out.println(rec1);
		System.out.println();

		Rectangle rec2 = new Rectangle(3, 8, Units.Meter);
		System.out.println(rec2);
		System.out.println();

		int rec1Area = UnitUtils.convertArear(rec1, Units.Millimeters);
		int rec2Area = UnitUtils.convertArear(rec2, Units.Millimeters);

		System.out.println("rec1Area in mm: " + rec1Area);
		System.out.println("rec2Area in mm: " + rec2Area);
		System.out.println("rec1Area is bigger than rec2Area? " + (rec1Area > rec2Area));

	}

}
