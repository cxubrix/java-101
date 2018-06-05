package day8;

public class Main {
	
	public static void main(String[] args) {
		
		Yacht yacht = new Yacht();
		System.out.println("yacht: " + yacht);
		
		Car car = new Car();
		System.out.println("car: " + car);
		
		Truck truck = new Truck();

		MotorBike motorBike = new MotorBike();
		
		car.printName();
		truck.printName();
		motorBike.printName();
		
	}
}
