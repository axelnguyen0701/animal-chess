package pieces;

public class Dog extends Piece{
    public Dog(Color color) {
        super(color,  3, true);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() <= 3;
    }
}
