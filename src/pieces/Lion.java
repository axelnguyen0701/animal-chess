package pieces;

public class Lion extends Piece{

    public Lion(Color color, int x, int y) {
        super(color, x, y, 7);
    }

    @Override
    public Boolean canKill(Piece piece) {
       return piece.getRank() != 8;
    }
}
