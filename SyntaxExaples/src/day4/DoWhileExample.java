package day4;

public class DoWhileExample {

	public static void main(String[] args) {

		// decrement by 1
		int i = 10;
		do {
			System.out.println("i: " + i);
			i--;
		} while (i > 0);

		// increment by 10
		int j = 0;
		do {
			System.out.println("j: " + j);
			j = j + 10;
		} while (j < 100);

	}
}
