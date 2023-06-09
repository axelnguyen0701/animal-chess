package pieces;

public class Wolf extends Piece{
    public Wolf(Color color, int x, int y) {
        super(color, x, y, 4);
    }

    @Override
    public Boolean canKill(Piece piece) {
       return piece.getRank() <= 4;
    }
}
