package pieces;

public class Lion extends Piece{

    public Lion(Color color) {
        super(color, 7);
    }

    @Override
    public Boolean canKill(Piece piece) {
       return piece.getRank() != 8;
    }
}
