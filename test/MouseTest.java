import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {
    private final Mouse mouse = new Mouse(Color.RED, 0, 1);
    private final Elephant elephant = new Elephant(Color.BLUE, 0, 2);
    private final Dog dog = new Dog(Color.BLUE, 0, 0);
    @Test
    void canKill() {
        assertEquals(true, mouse.canKill(elephant));
        assertEquals(false, mouse.canKill(dog));
    }
}