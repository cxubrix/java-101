package oop2.utils;

import oop2.Rectangle;
import oop2.Units;

public class UnitUtils {

	// define static final constants
	private static final int Millimeters_To_Centimeters = 10;
	private static final int Centimeters_To_Meter = 100;
	private static final int Millimeters_To_Meter = Millimeters_To_Centimeters * Centimeters_To_Meter;

	private UnitUtils() { // hide default constructor, so that we can not create instances
	}

	public static int convertPerimeter(Rectangle rectangle, Units units) {
		return convert(rectangle.perimeter(), rectangle.getUnits(), units);
	}

	public static int convertArear(Rectangle rectangle, Units units) {
		return convert(rectangle.area(), rectangle.getUnits(), units);
	}

	private static int convert(int amount, Units fromUnit, Units toUnit) {

		if (fromUnit == Units.Millimeters && toUnit == Units.Centimeters) {
			return amount / Millimeters_To_Centimeters;
		} else if (fromUnit == Units.Millimeters && toUnit == Units.Meter) {
			return amount / Millimeters_To_Meter;
		} else if (fromUnit == Units.Centimeters && toUnit == Units.Millimeters) {
			return amount * Millimeters_To_Centimeters;
		} else if (fromUnit == Units.Centimeters && toUnit == Units.Meter) {
			return amount / Centimeters_To_Meter;
		} else if (fromUnit == Units.Meter && toUnit == Units.Millimeters) {
			return amount * Millimeters_To_Meter;
		} else if (fromUnit == Units.Meter && toUnit == Units.Centimeters) {
			return amount * Centimeters_To_Meter;
		} else {
			return amount; // both units are equal
		}
	}
}
