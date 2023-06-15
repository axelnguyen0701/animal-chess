package pieces;

public class Wolf extends Piece{
    public Wolf(Color color) {
        super(color, 4);
    }

    @Override
    public Boolean canKill(Piece piece) {
       return piece.getRank() <= 4;
    }
}
