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

    public Boolean isMoveValid (int x, int y) {
        if (Math.abs(this.x - x) > 1)
            return false;
        if (Math.abs(this.y - y) > 1)
            return false;
        return this.x == x || this.y == y;
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
