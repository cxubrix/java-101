package day4;

public class WhileExample {

	public static void main(String[] args) {

		// decrement by 1
		int i = 10;
		while (i > 0) {
			System.out.println("i: " + i);
			i--;
		}

		// increment by 10
		int j = 0;
		while (j < 100) {
			System.out.println("j: " + j);
			j = j + 10;
		}

	}

}
