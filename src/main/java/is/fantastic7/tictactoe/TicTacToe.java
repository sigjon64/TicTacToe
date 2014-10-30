import java.util.Scanner;
import static java.lang.System.out;

public class TicTacToe {
	public char[][] board;
	public char playerX;
	public TicTacToe() {}

	public void setStartPlayer() {
		this.playerX = 'x';
	}

	public void initializeBoard() {
		board = new char[3][3];
	}

	public void newBoard() {
		for(int rows = 0; rows < 3; rows++) {
			for(int cols = 0; cols < 3; cols++) {
				board[rows][cols] = '-';
			}
		}
	}

	//Board is displayed in current state
	public String displayBoard()
	{
		String printBoard = "";
		printBoard += "-------------\n";

		for(int rows = 0; rows < 3; rows++)
		{	
			printBoard +="| ";
			for(int cols = 0; cols < 3; cols++)
			{
				printBoard += board[rows][cols];
				printBoard += " | ";
			}

			printBoard += "\n";
			printBoard += "-------------\n";

		}
		System.out.println(printBoard);
		return printBoard;
	}
}




