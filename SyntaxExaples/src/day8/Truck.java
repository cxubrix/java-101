package day8;

public class Truck extends WheeledVehicle {

	@Override
	public int getNumberOfWheels() {
		return 8;
	}
	
	@Override
	public void printName() {
		System.out.println("Hi, I am a truck!");
	}

}
