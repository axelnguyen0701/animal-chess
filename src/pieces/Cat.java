package pieces;

public class Cat extends Piece{
    public Cat(Color color, int x, int y ) {
        super(color, x, y, 2);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() <= 2;
    }
}
