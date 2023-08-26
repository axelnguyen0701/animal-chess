import pieces.*;

public class Board {
    private final Spot[][] board = new Spot[7][9];
    public Board() {
        initBoard();
    }

    public Spot getBox(int x, int y) throws Exception {
        if (x < 0 || x > 6 || y< 0 || y > 8) {
            throw new Exception("Index out of bound");
        }
        return board[x][y];
    }
    private void initBoard() {
        //Blue
        board[0][0] = new Spot(new Tiger(Color.BLUE), 0, 0);
        board[2][0] = new Spot(null, 2, 0, false, true);
        board[3][0] = new Spot(null, 3, 0, false, false, true, Color.BLUE);
        board[4][0] = new Spot(null, 4, 0, false, true);
        board[6][0] = new Spot(new Lion(Color.BLUE), 6, 0);
        board[1][1] = new Spot(new Cat(Color.BLUE), 1, 1);
        board[3][1] = new Spot(null, 3, 1, false, true);
        board[5][1] = new Spot(new Dog(Color.BLUE), 5, 1);
        board[0][2] = new Spot(new Elephant(Color.BLUE), 0, 2);
        board[2][2] = new Spot(new Wolf(Color.BLUE), 2, 2);
        board[4][2] = new Spot(new Leopard(Color.BLUE), 4, 2);
        board[6][2] = new Spot(new Mouse(Color.BLUE), 6, 2);

        //Neutral, need to init water
        for (int x = 1; x < 6; x++) {
            if (x == 3) continue;
            for (int y = 3; y < 6; y++) {
                board[x][y] = new Spot(null, x, y, true);
            }
        }

        //Red
        board[0][6] = new Spot(new Mouse(Color.RED), 0, 6);
        board[2][6] = new Spot(new Leopard(Color.RED), 2, 6);
        board[4][6] = new Spot(new Wolf(Color.RED), 4, 6);
        board[6][6] = new Spot(new Elephant(Color.RED), 6, 6);
        board[1][7] = new Spot(new Dog(Color.RED), 1, 7);
        board[3][7] = new Spot(null, 3, 7, false, true);
        board[5][7] = new Spot(new Cat(Color.RED), 5, 7);
        board[0][8] = new Spot(new Lion(Color.RED), 0, 8);
        board[2][8] = new Spot(null, 2, 8, false, true);
        board[3][8] = new Spot(null, 3, 8, false, false, true, Color.RED);
        board[4][8] = new Spot(null, 4, 8, false, true);
        board[6][8] = new Spot(new Tiger(Color.RED), 6, 8);

        //Rest is blank
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 9; y++) {
                if (board[x][y] == null)
                    board[x][y] = new Spot(null, x, y);
            }
        }
    }

    @Override
    public String toString() {
        String boardString = "";
        for (Spot[] spots : board) {
            for (Spot spot : spots) {
               boardString = boardString.concat(spot.toString()).concat("\n");
            }
        }
        return boardString;
    }
}
