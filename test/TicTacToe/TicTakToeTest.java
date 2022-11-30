

package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTakToeTest {
    private   TicTakToe ticTakToe;
   private Player player1;
   private Player player2;

    @BeforeEach
    void setUp() {
         player1 = new Player();
       player2 = new Player ();
       ticTakToe = new TicTakToe(player1,  player2) ;


    }
    @Test
    void ticTacToe(){
        assertNotNull(ticTakToe);
    }
    @Test
    void playerExist(){
        assertNotNull(ticTakToe.getPlayer1());
        assertNotNull(ticTakToe.getPlayer2());
    }
    @Test
    void testTicTacToeHasABoad(){
        String expected = """
               |     |     |     |
               |     |     |     |
               |     |     |     |
                """;
assertEquals(expected, ticTakToe.getBoard());

    }
}
