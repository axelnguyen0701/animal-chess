package pieces;

public class Elephant extends Piece {
    public Elephant(Color color, int x, int y) {
        super(color, x, y,8);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() != 1;
    }
}
