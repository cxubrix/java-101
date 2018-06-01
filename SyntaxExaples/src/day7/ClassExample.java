package day7;

public class ClassExample {
	
	public static void main(String[] args) {

		House myHouse = new House("Green", "My Address 1-5", 1);
		House yourHouse = new House("Gray", "Your Address 15,1", 4);
		
		System.out.println("The color of my house is " + myHouse.color);
		myHouse.repaintHouse("Red");
		System.out.println("I repainted my house. Now it is:  " + myHouse.color);
		
		

	}
	
}
