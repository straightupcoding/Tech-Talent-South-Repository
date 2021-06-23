package ticTacToeGame;

public class TicTacToeClass {
	
	private char[][] board;
	private int turns;

	
	public TicTacToeClass() {
		board = new char[3][3];
		turns = 0;

		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				board[r][c] = ' ';
	}



	public boolean isWinner(char p) {
		if (p == board[0][0] && p == board[0][1] && p == board[0][2])
			return true;
		if (p == board[1][0] && p == board[1][1] && p == board[1][2])
			return true;
		if (p == board[2][0] && p == board[2][1] && p == board[2][2])
			return true;
		if (p == board[0][0] && p == board[1][0] && p == board[2][0])
			return true;
		if (p == board[0][1] && p == board[1][1] && p == board[2][1])
			return true;
		if (p == board[0][2] && p == board[1][2] && p == board[2][2])
			return true;
		if (p == board[0][0] && p == board[1][1] && p == board[2][2])
			return true;
		if (p == board[0][2] && p == board[1][1] && p == board[2][0])
			return true;
		return false;
	}

	public boolean isFull() {
		if (turns == 9)
			return true;
		return false;
	}

	public boolean isCat() {
		if (turns >= 9 && (!isWinner('X')) && (!isWinner('O')))
			
			return true;
		return false;
	}

	public boolean isValid(int r, int c) {
		if (0 <= r && r <= 2 && 0 <= c && c <= 2)
			return true;
		else
			return false;
	}

	public int numTurns() {
		return turns;
	}

	public char playerAt(int r, int c) {
		if (isValid(r, c))
			return board[r][c];
		else
			return '@';
	}

	public void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	
	public void playMove(char p, int r, int c) {
		
		if (turns <= 9) {
			board[r][c] = p;
			turns++;
		} else
			System.out.println("It's a tie!");
		

	}

}