package tictactoe;

public class Board {

	// private String[][] board = new String[3][3];
	private String[][] board = { 
			{ "", "", "" }, 
			{ "", "", "" }, 
			{ "", "", "" } 
		};

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].isEmpty()) {
					System.out.print("|" + " ");
				} else {
					System.out.print("|" + board[i][j]);
				}
			}
			System.out.print("|");
			System.out.println();
		}
	}

	public void setValue(int x, int y, String value) {
		board[x][y] = value;
	}

	public boolean checkPosition(int x, int y) {
		String value = board[x][y];
		if (value.equals("X") || value.equals("O")) {
			return false;
		}
		return true;
	}
}
