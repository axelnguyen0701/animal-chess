import pieces.*;

public class Board {
    private final Spot[][] board = new Spot[9][7];
    public Board() {
        initBoard();
    }

    public Spot getBox(int x, int y) throws Exception {
        if (x < 0 || x > 8 || y< 0 || y > 6) {
            throw new Exception("Index out of bound");
        }
        return board[x][y];
    }
    private void initBoard() {
        //Blue
        board[0][0] = new Spot(new Tiger(Color.BLUE), 0, 0);
        board[0][2] = new Spot(null, 0, 2, false, true);
        board[0][3] = new Spot(null, 0, 3, false, false, true, Color.BLUE);
        board[0][4] = new Spot(null, 0, 4, false, true);
        board[0][6] = new Spot(new Lion(Color.BLUE), 0, 6);
        board[1][1] = new Spot(new Cat(Color.BLUE), 1, 1);
        board[1][3] = new Spot(null, 1, 3, false, true);
        board[1][5] = new Spot(new Dog(Color.BLUE), 1, 5);
        board[2][0] = new Spot(new Elephant(Color.BLUE), 2, 0);
        board[2][2] = new Spot(new Wolf(Color.BLUE), 2, 2);
        board[2][4] = new Spot(new Leopard(Color.BLUE), 2, 4);
        board[2][6] = new Spot(new Mouse(Color.BLUE), 2, 6);

        //Neutral, need to init water
        for (int i = 3; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j == 3)
                    continue;
                board[i][j] = new Spot(null, i, j, true);
            }
        }

        //Red
        board[6][0] = new Spot(new Mouse(Color.RED), 6, 0);
        board[6][2] = new Spot(new Leopard(Color.RED), 6, 2);
        board[6][4] = new Spot(new Wolf(Color.RED), 6, 4);
        board[6][6] = new Spot(new Elephant(Color.RED), 6, 6);
        board[7][1] = new Spot(new Dog(Color.RED), 7, 1);
        board[7][3] = new Spot(null, 7, 3, false, true);
        board[7][5] = new Spot(new Cat(Color.RED), 7, 5);
        board[8][0] = new Spot(new Lion(Color.RED), 8, 0);
        board[8][2] = new Spot(null, 8, 2, false, true);
        board[8][3] = new Spot(null, 8, 3, false, false, true, Color.RED);
        board[8][4] = new Spot(null, 8, 4, false, true);
        board[8][6] = new Spot(new Tiger(Color.RED), 8, 6);

        //Rest is blank
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == null)
                    board[i][j] = new Spot(null, i, j);
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
