package tictactoe;

public class Main {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		
		board.printBoard();
		
		boolean canWrite = board.checkPosition(0, 0);
		System.out.println("canWrite [0, 0]: " + canWrite);
		
		board.setValue(1,  2,  "X");
		board.setValue(0,  1,  "O");
		
		board.printBoard();

		canWrite = board.checkPosition(1, 2);
		System.out.println("canWrite [1, 2]: " + canWrite);
		
		// canWrite = board.checkPosition(4, 5);

		Player player = new HumanPlayer();
		int[] movePosition = player.makeMove();
		System.out.println("movePosition: " + movePosition[0] + " "+ movePosition[1] );

		
		
	}
	
}
