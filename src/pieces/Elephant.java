package pieces;

public class Elephant extends Piece {
    public Elephant(Color color) {
        super(color, 8);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() != 1;
    }
}
