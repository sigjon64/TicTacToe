import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.Scanner;
import static java.lang.System.out;


public class TicTacToeTest 
{
	private TicTacToe t;

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.fantastic7.tictactoe.TicTacToeTest");
	}

	@Before
	public void setup() {
		t = new TicTacToe();
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
		String expected = "-------------\n| - | - | - | \n-------------\n| - | - | - | \n-------------\n| - | - | - | \n-------------\n";
		assertEquals(actual, expected);
	}

}
