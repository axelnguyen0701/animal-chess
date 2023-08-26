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
           assertEquals(board.getBox(2, 0).getTrap(), true);
           assertEquals(board.getBox(4, 0).getTrap(), true);
           assertEquals(board.getBox(3, 0).getCave(), true);
           assertEquals(board.getBox(6, 0).getPiece(), new Lion(Color.BLUE));
           assertEquals(board.getBox(1,1).getPiece(), new Cat(Color.BLUE));
           assertEquals(board.getBox(5, 1).getPiece(), new Dog(Color.BLUE));
           assertNull(board.getBox(0, 1).getPiece());
           assertEquals(board.getBox(0, 2).getPiece(), new Elephant(Color.BLUE));
           assertEquals(board.getBox(2, 2).getPiece(), new Wolf(Color.BLUE));
           assertEquals(board.getBox(4, 2).getPiece(), new Leopard(Color.BLUE));
           assertEquals(board.getBox(6, 2).getPiece(), new Mouse(Color.BLUE));
           assertEquals(board.getBox(1, 3).getIsWater(), true);
           assertEquals(board.getBox(2, 3).getIsWater(), true);
           assertEquals(board.getBox(5, 5).getIsWater(), true);

           assertEquals(board.getBox(3, 1).getTrap(), true);
           assertThrows(Exception.class, () -> {
               board.getBox(1, 10);
               board.getBox(10, 1);
           });
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}