package pieces;

public class Tiger extends Piece {
    public Tiger(Color color, int x, int y) {
        super(color, x, y, 6);
    }
    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() <= 6;
    }
}
