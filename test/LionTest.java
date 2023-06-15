import org.junit.jupiter.api.Test;
import pieces.Color;
import pieces.Elephant;
import pieces.Lion;
import pieces.Tiger;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    private final Lion lion = new Lion(Color.RED);
    private final Elephant elephant = new Elephant(Color.BLUE);
    private final Tiger tiger = new Tiger(Color.BLUE);
    @Test
    void canKill() {
        assertEquals(false, lion.canKill(elephant));
        assertEquals(true, lion.canKill(tiger));
    }
}