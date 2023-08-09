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
        assertTrue(game.playerMove(p1, 2, 6, 3,6));
    }
}