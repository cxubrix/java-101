package tictactoe;
import java.util.Scanner;

public class HumanPlayer implements Player {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public int[] makeMove() {

		int x = getInput("Ievadi rindu: ");
		int y = getInput("Ievadi kolonu: ");

		return new int[] { x, y };
	}

	private int getInput(String text) {	
		int value = -1;
		do {
			System.out.print(text);
			value = scanner.nextInt();
		} while (value < 0 || value > 2);

		return value;
	}

}
