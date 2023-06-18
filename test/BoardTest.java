import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pieces.*;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;
    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void getBoard() {
       try {
           assertEquals(board.getBox(0,0).getPiece(), new Tiger(Color.BLUE));
           assertEquals(board.getBox(0, 2).getTrap(), true);
           assertEquals(board.getBox(0, 4).getTrap(), true);
           assertEquals(board.getBox(0, 3).getCave(), true);
           assertEquals(board.getBox(0, 6).getPiece(), new Lion(Color.BLUE));
           assertEquals(board.getBox(1,1).getPiece(), new Cat(Color.BLUE));
           assertEquals(board.getBox(1, 5).getPiece(), new Dog(Color.BLUE));
           assertNull(board.getBox(1, 0).getPiece());
           assertEquals(board.getBox(2, 0).getPiece(), new Elephant(Color.BLUE));
           assertEquals(board.getBox(2, 2).getPiece(), new Wolf(Color.BLUE));
           assertEquals(board.getBox(2, 4).getPiece(), new Leopard(Color.BLUE));
           assertEquals(board.getBox(2, 6).getPiece(), new Mouse(Color.BLUE));
           assertEquals(board.getBox(3, 1).getIsWater(), true);
           assertEquals(board.getBox(3, 2).getIsWater(), true);

           assertEquals(board.getBox(1, 3).getTrap(), true);
           assertThrows(Exception.class, () -> {
               board.getBox(10, 1);
           });
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}