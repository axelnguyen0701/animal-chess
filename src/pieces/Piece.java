package pieces;

public abstract class Piece {
    final Color color;
    private int rank;

    public Boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(Boolean canSwim) {
        this.canSwim = canSwim;
    }

    private Boolean canSwim = false;

    Piece(Color color, int x, int y, int rank) {
        this.color = color;
        this.rank = rank;
    }

    Piece(Color color, int x, int y, int rank, Boolean canSwim) {
        this(color, x, y, rank);
        this.canSwim = canSwim;
    }

    public abstract Boolean canKill (Piece piece);

    public Color getColor() {
        return color;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
