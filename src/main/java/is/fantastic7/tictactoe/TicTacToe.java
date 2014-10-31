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

		for(int rows = 0; rows < 3; rows++) {	
			printBoard +="| ";
			for(int cols = 0; cols < 3; cols++) {
				printBoard += board[rows][cols];
				printBoard += " | ";
			}

			printBoard += "\n";
			printBoard += "-------------\n";
		}

		System.out.println(printBoard);
		return printBoard;
	}

	//Check if any cell of the board still contains no value, represented by '-' if so 
	//the game continues else the board is full
	public boolean checkIfBoardFull()
	{
		boolean boardFull = true;

		for(int rows = 0; rows < 3; rows++) {
			for(int cols = 0; cols < 3; cols++) {
				if(board[rows][cols] == '-') {
					boardFull = false;
				}
			}
		}
		return boardFull;
	}

	//Register the current players moves on a specific cell on the board defined by
	//either 'x' or 'o'. The cell is defined by a input of a specific row and column.
	public boolean registerMove(int row, int col) {
		if ((row >= 0) && (row < 3)) {
        	if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = playerX;
                    return true;
                }
            }
        }
        return false;
	} 



}




