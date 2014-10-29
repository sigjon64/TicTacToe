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
	public static int row;
	public static int col;
	public static int [][] playBoard = new int [ROW][COL];

	public static Scanner readin = new Scanner(System.in);
		

	public static void initialGameBoard() {
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				playBoard[row][col] = EMPTY;
			}
		}
		state = PLAYS;
		player = EX;
	}

	public static void enterMove(int theDoer) {
		boolean leagalMove = false;
		do {
			if (theDoer == EX) {
				System.out.println("Player X make your move, choose row(1-3) and column(1-3)");
			}
			else {
				System.out.println("Player O make your move, choose row(1-3) and column(1-3)");
			}
			int inrow = readin.nextInt() - 1;
			int incol = readin.nextInt() - 1;

			if(inrow >= 0 && inrow < ROW && incol >= 0 && incol < COL && playBoard[inrow][incol] == EMPTY) {
				row = inrow;
				col = incol;
				playBoard[row][col] = theDoer;
				leagalMove = true;
			}
			else {
				System.out.println("Illegal move! Try again...");
			}

		}
		while(leagalMove = true);
	}
}
