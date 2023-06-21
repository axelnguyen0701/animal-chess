package pieces;

import java.util.Objects;

public abstract class Piece {
    final Color color;
    private int rank;

    public Boolean getCanSwim() {
        return canSwim;
    }

    private void setCanSwim(Boolean canSwim) {
        this.canSwim = canSwim;
    }

    private Boolean canSwim = false;
    private boolean killed = false;



    Piece(Color color, int rank) {
        this.color = color;
        this.rank = rank;
    }

    Piece(Color color, int rank, Boolean canSwim) {
        this(color, rank);
        setCanSwim(canSwim);
    }

    public abstract Boolean canKill (Piece piece);

    public Color getColor() {
        return color;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return rank == piece.rank && color == piece.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, rank);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }
}
