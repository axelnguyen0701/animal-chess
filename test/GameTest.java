import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Player.HumanPlayer;
import pieces.Color;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;
    private HumanPlayer p1;
    private HumanPlayer p2;
    @BeforeEach
    void setUp() {
        p1 = new HumanPlayer(Color.BLUE);
        p2 = new HumanPlayer(Color.RED);
        game = new Game(p1, p2);
    }

    @Test
    void playerMove() {
        //Move mouse
        assertTrue(game.playerMove(p1, 6, 2, 6,3));
        //P1 move again
        assertFalse(game.playerMove(p1, 6, 3, 6, 4));
        //P2 move elephant
        assertTrue(game.playerMove(p2, 6, 6, 6, 5));
        //p1 move mouse
        assertTrue(game.playerMove(p1, 6, 3, 6, 4));
        //p2 move elephant but cannot kill mouse
        assertFalse(game.playerMove(p2, 6, 5, 6, 4));
        //p2 move wolf
        assertTrue(game.playerMove(p2, 4, 6, 5, 6));
        //p1 kill elephant
        assertTrue(game.playerMove(p1, 6, 4, 6, 5));
        //p2 move wolf to water
        assertFalse(game.playerMove(p2, 5, 6, 5, 5));
        //p2 move wolf to elephant original
        assertTrue(game.playerMove(p2, 5, 6, 6, 6));
        //p1 move mouse to water
        assertTrue(game.playerMove(p1, 6, 5, 5, 5));
    }
}