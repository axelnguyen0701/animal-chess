    import pieces.Color;
    import pieces.Piece;

    import java.util.Objects;

    public class Spot {
        private Piece piece;
        private int x;
        private int y;
        private Boolean isWater = false;
        private Boolean isTrap = false;
        private Boolean isCave = false;
        private Color caveColor;

        public Spot(Piece piece, int x, int y) {
            this.piece = piece;
            this.x = x;
            this.y = y;
        }

        public Spot(Piece piece, int x, int y, Boolean isWater) {
            this(piece, x, y);
            this.isWater = isWater;
        }

        @Override
        public String toString() {
            return "Spot{" +
                    "piece=" + piece +
                    ", x=" + x +
                    ", y=" + y +
                    ", isWater=" + isWater +
                    ", isTrap=" + isTrap +
                    ", isCave=" + isCave +
                    ", caveColor=" + caveColor +
                    '}';
        }

        public Spot(Piece piece, int x, int y, Boolean isWater, Boolean isTrap) {
            this(piece, x, y);
            this.setTrap(isTrap);
        }

        public Spot(Piece piece, int x, int y, Boolean isWater, Boolean isTrap, Boolean isCave, Color caveColor) {
            this(piece, x, y);
            this.setCave(isCave);
            this.setCaveColor(caveColor);
        }

        public Color getCaveColor() {
            return caveColor;
        }

        public void setCaveColor(Color caveColor) {
            this.caveColor = caveColor;
        }

        public Boolean getCave() {
            return isCave;
        }

        public void setCave(Boolean cave) {
            isCave = cave;
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
            //Only dogs and mice can cross water
            if (spot.getIsWater() && !this.getPiece().getCanSwim())
                return false;

            if(spot.getPiece() != null && !spot.getPiece().isKilled()) {
                //only higher rank can kill lower rank (if this is not a trap)
                if (!this.getPiece().canKill(spot.getPiece()) && !this.isTrap)
                    return false;
                //Cannot kill piece in trap
                if (spot.getTrap())
                    return false;
                if (spot.getPiece().getColor() == this.getPiece().getColor())
                    return false;
            }

            //Can only move to cave if different color
            if (spot.getCave() && this.getCaveColor() == this.getPiece().getColor())
                return false;
            if (Math.abs(spot.getX() - this.x) > 1)
                return false;
            if (Math.abs(spot.getY() - this.y) > 1)
                return false;
            return spot.getX() == this.x || spot.getY() == this.y;
        }
    }
