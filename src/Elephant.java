public class Elephant extends Piece {
    public Elephant(Color color, int x, int y) {
        super(color, x, y);
        this.setRank(8);
    }

    @Override
    Boolean canKill(Piece piece) {
        return piece.getRank() != 1;
    }
}
