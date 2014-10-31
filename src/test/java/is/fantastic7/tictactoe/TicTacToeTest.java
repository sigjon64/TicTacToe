import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.Scanner;
import static java.lang.System.out;


public class TicTacToeTest 
{
	private TicTacToe t;
	String printBoard;

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.fantastic7.tictactoe.TicTacToeTest");
	}

	@Before
	public void setup() {
		t = new TicTacToe();
		printBoard = "-------------\n| - | - | - | \n-------------\n| - | - | - | \n-------------\n| - | - | - | \n-------------\n";
	}

	@Test
	public void testSetStartPlayer() {
		t.setStartPlayer();
		assertEquals('x', t.playerX);
	}

	@Test
	public void testTicTacToeConstructor() {
		t.initializeBoard();
		for(int i = 0; i < 3; i++) {
			assertEquals(3, t.board[i].length);
		}	
	}

	@Test
	public void testNewBoard() {
		t.initializeBoard();
		t.newBoard();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals('-', t.board[i][j]);
			}
		}
	}

	@Test
	public void testDisplayBoard() {
		t.initializeBoard();
		t.newBoard();
		String actual = t.displayBoard();
		String expected = printBoard;
		assertEquals(actual, expected);
	}

	@Test
	public void testCheckIfBoardNotFull() {
		t.initializeBoard();
		t.newBoard();
		t.setStartPlayer();
		boolean actual = t.checkIfBoardFull();
		assertEquals(actual, false);
	}

	@Test
	public void testRegisterMove() {
		t.initializeBoard();
		t.newBoard();
		t.setStartPlayer();
		String expected = "-------------\n| x | - | - | \n-------------\n| - | - | - | \n-------------\n| - | - | - | \n-------------\n";
		t.registerMove(0,0);
		String actual = t.displayBoard();
		assertEquals(actual, expected);
	}

	@Test
	public void testSwitchPlayer() {
		t.setStartPlayer();
		t.switchPlayer();
		assertEquals('o', t.playerX);
		t.switchPlayer();
		assertEquals('x', t.playerX);
	}

}
