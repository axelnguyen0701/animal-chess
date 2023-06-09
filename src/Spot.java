import pieces.Piece;

import java.util.Objects;

public class Spot {
    private Piece piece;
    private int x;
    private int y;
    private Boolean isWater = false;
    private Boolean isTrap = false;

    public Spot(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Spot(Piece piece, int x, int y, Boolean isWater) {
        this(piece, x, y);
        this.isWater = isWater;
    }

    public Spot(Piece piece, int x, int y, Boolean isWater, Boolean isTrap) {
        this(piece, x, y);
        this.setTrap(isTrap);
    }

    public Boolean getWater() {
        return isWater;
    }

    public Boolean getTrap() {
        return isTrap;
    }

    public void setTrap(Boolean trap) {
        isTrap = trap;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Boolean getIsWater() {
        return isWater;
    }

    public void setWater(Boolean water) {
        isWater = water;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spot spot = (Spot) o;
        return x == spot.x && y == spot.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Boolean isMoveValid (Spot spot) {
        if (spot.equals(this))
            return false;
        if (spot.getIsWater() && !spot.getPiece().getCanSwim())
            return false;
        if (spot.getPiece() != null && !this.getPiece().canKill(spot.getPiece()))
            return false;
        if (Math.abs(spot.getX() - this.x) > 1)
            return false;
        if (Math.abs(spot.getY() - this.y) > 1)
            return false;
        return spot.getX() == this.x || spot.getY() == this.y;
    }
}
