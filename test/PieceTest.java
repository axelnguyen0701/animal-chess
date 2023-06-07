import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTest {
    private final Elephant elephant = new Elephant(Color.BLUE, 0, 1);
    @org.junit.jupiter.api.Test
    void testIsMoveValid() {
//        2 to the right
        assertEquals(false, elephant.isMoveValid(3, 1));
//        1 to the right
        assertEquals(true, elephant.isMoveValid(1, 1));
//        3 up
        assertEquals(false, elephant.isMoveValid(0, 4));
//        1 up
        assertEquals(true, elephant.isMoveValid(0, 2));
//        1 right, 1 up
        assertEquals(false, elephant.isMoveValid(1,2));
    }
}