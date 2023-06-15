package pieces;

public class Cat extends Piece{
    public Cat(Color color) {
        super(color, 2);
    }

    @Override
    public Boolean canKill(Piece piece) {
        return piece.getRank() <= 2;
    }
}
