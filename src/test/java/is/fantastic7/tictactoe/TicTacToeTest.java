import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


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
}
