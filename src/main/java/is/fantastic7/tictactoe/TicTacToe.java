import java.util.Scanner;
import static java.lang.System.out;

public class TicTacToe {

	public static final int ROW = 2; //
	public static final int COL = 2; // 

	public static final int PLAYS = 0;
	
	public static final int EMPTY = 0; // " " 
	public static final int EX = 1; // "X"
	public static int player;
	public static int state;
	public static int [][] playBoard = new int [ROW][COL];
		

	public static void initialGameBoard() {
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				playBoard[row][col] = EMPTY;
			}
		}
		state = PLAYS;
		player = EX;
	}
}
