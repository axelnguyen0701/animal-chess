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

}
