package day7;

public class ClassExample {

	public static void main(String[] args) {

		House myHouse = new House("Green", "My Address 1-5", 1);
		House yourHouse = new House("Red", "Your Address 15,1", 4);

		System.out.println("The color of my house is " + myHouse.getColor());
//		myHouse.repaintHouse("Black");

//		 yourHouse.repaintHouseBlack();
		 yourHouse.setAddress("New Address");;

		System.out.println("I repainted my house. Now it is:  " + myHouse.getColor());

//		boolean myHouseHasMorePeople = myHouse.numberOfPersons > yourHouse.numberOfPersons;
		boolean myHouseHasMorePeople = hasMorePeople(myHouse, yourHouse);
		System.out.println("myHouseHasMorePeople: " + myHouseHasMorePeople);
		
		String myHouseString = myHouse.toString();
		System.out.println("myHouse: " + myHouse);
		System.out.println("yourHouse: " + yourHouse);
		System.out.println("myHouseString equals yourHouse: " + myHouse.equals(yourHouse));

	}

	public static boolean hasMorePeople(House h1, House h2) {
		System.out.println("h1: " + h1.getNumberOfPersons());
		System.out.println("h2: " + h2.getNumberOfPersons());
		return h1.getNumberOfPersons() > h2.getNumberOfPersons();
	}
	

}
