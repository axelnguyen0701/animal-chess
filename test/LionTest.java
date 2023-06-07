import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    private final Lion lion = new Lion(Color.RED, 0, 1);
    private final Elephant elephant = new Elephant(Color.BLUE, 0, 2);
    private final Tiger tiger = new Tiger(Color.BLUE, 0, 2);
    @Test
    void canKill() {
        assertEquals(false, lion.canKill(elephant));
        assertEquals(true, lion.canKill(tiger));
    }
}