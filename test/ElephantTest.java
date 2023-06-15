import pieces.Color;
import pieces.Elephant;
import pieces.Lion;
import pieces.Mouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElephantTest {
    private final Elephant elephant = new Elephant(Color.BLUE);
    private final Lion lion = new Lion(Color.RED);
    private final Mouse mouse = new Mouse(Color.RED);
    @org.junit.jupiter.api.Test
    void canKill() {
        assertEquals(true, elephant.canKill(lion));
        assertEquals(false, elephant.canKill(mouse));
    }
}