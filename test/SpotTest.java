import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpotTest {
    private Spot elephantSpot;
    private Spot upElephantSpot;
    private Spot twoUpElephantSpot;
    private Spot threeUpElephantSpot;
    private Spot redMouseSpot;
    private Spot waterSpot;
    @BeforeEach
    void setUp() {
        Board board = new Board();
        try {
            elephantSpot = board.getBox(2,0);
            upElephantSpot = board.getBox(3,0);
            twoUpElephantSpot = board.getBox(4,0);
            threeUpElephantSpot = board.getBox(5, 0);
            redMouseSpot = board.getBox(6,0);
            waterSpot = board.getBox(3, 1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void isMoveValid() {
        //Can only move one spot but not two
        assertTrue(elephantSpot.isMoveValid(upElephantSpot));
        assertFalse(elephantSpot.isMoveValid(twoUpElephantSpot));
        //After making 1 up then can move to two up
        upElephantSpot.setPiece(elephantSpot.getPiece());
        elephantSpot.setPiece(null);
        assertTrue(upElephantSpot.isMoveValid(twoUpElephantSpot));
        //Cannot cross water
        twoUpElephantSpot.setPiece(upElephantSpot.getPiece());
        upElephantSpot.setPiece(null);
        assertFalse(twoUpElephantSpot.isMoveValid(waterSpot));
        //Cannot kill mouse
        threeUpElephantSpot.setPiece(twoUpElephantSpot.getPiece());
        twoUpElephantSpot.setPiece(null);
        assertFalse(threeUpElephantSpot.isMoveValid(redMouseSpot));
        //Mouse can kill elephant
        assertTrue(redMouseSpot.isMoveValid(threeUpElephantSpot));
    }
}