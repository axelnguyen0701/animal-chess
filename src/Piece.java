abstract class Piece {
    final Color color;
    private int x;
    private int y;
    private int rank;

    Piece(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    private Boolean isMoveValid (int x, int y) {
        return Math.abs(x - this.x) <= 1 && Math.abs(y - this.y) <= 1;
    }

    abstract Boolean canKill (Piece piece);

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
