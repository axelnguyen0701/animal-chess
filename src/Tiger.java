public class Tiger extends Piece {
    public Tiger(Color color, int x, int y) {
        super(color, x, y);
        this.setRank(6);
    }
    @Override
    Boolean canKill(Piece piece) {
        return piece.getRank() <= 6;
    }
}
