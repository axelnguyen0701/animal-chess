package pieces;

public class Mouse extends Piece{
    public Mouse(Color color) {
        super(color,  1, true);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() == 8;
    }
}
