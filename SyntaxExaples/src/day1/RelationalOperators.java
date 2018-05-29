package day1;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// define variables 
		int x = 10;
		int y = 4;
		
		System.out.println("x == y is " + (x == y)); // x == y is false
		System.out.println("x != y is " + (x != y)); // x != y is true
		System.out.println("x > y is " + (x > y)); // x > y is true
		System.out.println("x < y is " + (x < y)); // x < y is false
		System.out.println("x >= y is " + (x >= y)); // x >= y is true
		System.out.println("x <= y is " + (x <= y)); // x <= y is false
		
		System.out.println("true == true is " + (true == true)); // true == true is true
		System.out.println("true == false is " + (true == false)); // true == false is false
		System.out.println("true != true is " + (true != true)); // true != true is false
		System.out.println("true != false is " + (true != false)); // true != false is true
		
	}

}
