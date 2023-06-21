import Player.Player;
import pieces.Piece;

public class Move {
    private Spot start;
    private Spot end;
    private Player player;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Spot start, Spot end, Player player) {
        this.start = start;
        this.end = end;
        this.player = player;
        this.pieceMoved = start.getPiece();
    }

    public Spot getStart() {
        return start;
    }

    public void setStart(Spot start) {
        this.start = start;
    }

    public Spot getEnd() {
        return end;
    }

    public void setEnd(Spot end) {
        this.end = end;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Piece getPieceMoved() {
        return pieceMoved;
    }

    public void setPieceMoved(Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }
}
