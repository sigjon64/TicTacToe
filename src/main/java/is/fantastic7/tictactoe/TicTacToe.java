import java.util.Scanner;
import static java.lang.System.out;

public class TicTacToe {
	public char[][] board;
	public char playerX;
	public TicTacToe() {
		board = new char [3][3];
		playerX = 'x';
		newBoard();
	}
	public void newBoard() {
		for(int rows = 0; rows < 3; rows++) {
			for(int cols = 0; cols < 3; cols++) {
				board[rows][cols] = '-';
			}
		}
	}
}




