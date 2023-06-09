package pieces;

public class Leopard extends Piece {
    public Leopard(Color color, int x, int y) {
        super(color, x, y, 5);
    }

    @Override
    public  Boolean canKill(Piece piece) {
        return piece.getRank() <= 5;
    }
}
