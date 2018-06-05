package day8;

public class Car extends WheeledVehicle {

	@Override
	public int getNumberOfWheels() {
		return 4;
	}

	public void printName() {
		super.printName();
		System.out.println("Hello, I am Car also!");
	}
}
