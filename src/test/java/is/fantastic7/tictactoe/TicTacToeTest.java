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
	public void testTicTacToeConstructor() {
		assertEquals('x', t.playerX);
		for(int i = 0; i < 3; i++) {
			assertEquals(3, t.board[i].length);
		}
		
	}


}
