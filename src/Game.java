import Player.Player;
import pieces.Color;
import pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Player[] players = new Player[2];
    private Board board;
    private final List<Move> moveList = new ArrayList<>();
    private GameStatus gameStatus;
    private Player currentTurn;

    private void initiate(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
        board = new Board();

        if (player1.getColor() == Color.BLUE) {
            this.currentTurn = player1;
        } else {
            this.currentTurn = player2;
        }

        moveList.clear();
    }

    public List<Move> getMoveList() {
        return this.moveList;
    }

    public Game(Player p1, Player p2) {
        initiate(p1, p2);
    }

    public boolean isEnd() {
        return this.gameStatus != GameStatus.ACTIVE;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
        try {
            Spot start = board.getBox(startX, startY);
            Spot end = board.getBox(endX, endY);
            Move move = new Move(start, end, player);
            return this.makeMove(move, player);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean makeMove(Move move, Player player) {
        Piece startPiece = move.getStart().getPiece();

        if(startPiece == null || startPiece.isKilled())
            return false;

        if (player != this.currentTurn)
            return false;

        if(startPiece.getColor() != player.getColor())
            return false;

        //Check move valid
        if(!move.getStart().isMoveValid(move.getEnd()))
            return false;

        //Kill
        Piece endPiece = move.getEnd().getPiece();
        if (endPiece != null) {
            endPiece.setKilled(true);
            move.setPieceKilled(endPiece);
        }

        moveList.add(move);

        move.getEnd().setPiece(move.getStart().getPiece());
        move.getStart().setPiece(null);

        if(move.getEnd().getCave()) {
            if (player.getColor() == Color.BLUE)
                this.setGameStatus(GameStatus.BLUE_WIN);
            else
                this.setGameStatus(GameStatus.RED_WIN);
        }

        if(this.currentTurn == players[0])
            this.currentTurn = players[1];
        else
            this.currentTurn = players[0];
        return true;
    }
}
