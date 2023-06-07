import static org.junit.jupiter.api.Assertions.assertEquals;

class ElephantTest {
    private final Elephant elephant = new Elephant(Color.BLUE, 0, 1);
    private final Lion lion = new Lion(Color.RED, 0, 2);
    private final Mouse mouse = new Mouse(Color.RED, 0, 0);
    @org.junit.jupiter.api.Test
    void canKill() {
        assertEquals(true, elephant.canKill(lion));
        assertEquals(false, elephant.canKill(mouse));
    }
}