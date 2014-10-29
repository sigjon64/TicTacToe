import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static java.lang.System.out;
import java.util.Scanner;



public class TicTacToeTest {

	private TicTacToe t;

	@Before
	public void setUp() {
		t = new TicTacToe();
	}

	@Test
	public void TestInitialGameBoard()
	{
		t.initialGameBoard();
		assertEquals(t.PLAYS, t.state);
		assertEquals(t.EX, t.player);
	}
	/*
	@Test
	public void TestEnterMove()
	{
		t.enterMove(1);
		Scanner input = new Scanner("Player X make your move, choose row(1-3) and column(1-3)");
		assertEquals("Player X make your move, choose row(1-3) and column(1-3)", t.EX);
		
		//assertEquals("Player O make your move, choose row(1-3) and column(1-3)", (t.theDoer != t.EX));
	}*/

}
