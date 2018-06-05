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
								
		int rec1Perimeter = UnitUtils.convertPerimeter(rec1, Units.Millimeters);
		int rec2Perimeter = UnitUtils.convertPerimeter(rec2, Units.Millimeters);

		System.out.println("rec1Area in mm: " + rec1Perimeter);
		System.out.println("rec2Area in mm: " + rec2Perimeter);
		System.out.println("rec1Perimeter is bigger than rec2Perimeter? " + (rec1Perimeter > rec2Perimeter));

	}

}
