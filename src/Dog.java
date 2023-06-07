public class Dog extends Piece{
    public Dog(Color color, int x, int y) {
        super(color, x, y, 3, true);
    }

    @Override
    Boolean canKill(Piece piece) {
        return piece.getRank() <= 3;
    }
}
