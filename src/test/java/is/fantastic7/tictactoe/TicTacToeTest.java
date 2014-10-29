import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.Scanner;
import static java.lang.System.out;


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
		//int wrong = 3;
		Scanner readin = new Scanner(System.in);
		assertEquals("Player X make your move, choose row(1-3) and column(1-3)", t.enterMove());

		//while(wrong >=4 || wrong <= 0) {
		//	assertEquals("Illegal move! Try again...", t.enterMove(0));
		//}
	}
	*/
	
}
