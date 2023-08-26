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
            elephantSpot = board.getBox(0,2);
            upElephantSpot = board.getBox(0,3);
            twoUpElephantSpot = board.getBox(0,4);
            threeUpElephantSpot = board.getBox(0, 5);
            redMouseSpot = board.getBox(0,6);
            waterSpot = board.getBox(1, 3);
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