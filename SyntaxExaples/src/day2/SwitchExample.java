package day2;

public class SwitchExample {

	public static void main(String[] args) {

		int i = 3;

		switch (i) { // exact match
		case 1:
			System.out.println("x = 1");
			break;
		case 2:
			System.out.println("x = 2");
			break;
		case 3:
			System.out.println("x = 3");
			break;
		case 4:
			System.out.println("x = 4");
			break;
		default: // case when none of above matches e.g. i = 10
			System.out.println("x is not 1 or 2 or 3 or 4, must be some other value");
			break;
		}
	}

}
