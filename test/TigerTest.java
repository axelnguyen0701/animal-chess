import org.junit.jupiter.api.Test;
import pieces.Color;
import pieces.Elephant;
import pieces.Tiger;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {
    private final Elephant elephant = new Elephant(Color.RED, 0, 1);
    private final Tiger tiger = new Tiger(Color.BLUE, 0, 2);
    @Test
    void canKill() {
        assertEquals(false, tiger.canKill(elephant));
    }
}