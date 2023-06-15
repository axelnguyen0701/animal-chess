package pieces;

public class Leopard extends Piece {
    public Leopard(Color color) {
        super(color, 5);
    }

    @Override
    public  Boolean canKill(Piece piece) {
        return piece.getRank() <= 5;
    }
}
