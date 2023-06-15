package pieces;

public class Tiger extends Piece {
    public Tiger(Color color) {
        super(color, 6);
    }
    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() <= 6;
    }
}
