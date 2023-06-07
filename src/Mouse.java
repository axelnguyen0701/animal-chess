public class Mouse extends Piece{
    public Mouse(Color color, int x, int y ) {
        super(color, x, y, 1, true);
    }

    @Override
    Boolean canKill(Piece piece) {
        return piece.getRank() == 8;
    }
}