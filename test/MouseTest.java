import org.junit.jupiter.api.Test;
import pieces.Color;
import pieces.Dog;
import pieces.Elephant;
import pieces.Mouse;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {
    private final Mouse mouse = new Mouse(Color.RED);
    private final Elephant elephant = new Elephant(Color.BLUE);
    private final Dog dog = new Dog(Color.BLUE);
    @Test
    void canKill() {
        assertEquals(true, mouse.canKill(elephant));
        assertEquals(false, mouse.canKill(dog));
    }
}