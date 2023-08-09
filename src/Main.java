import Player.HumanPlayer;
import pieces.Color;

public class Main {
    public static void main(String[] args) {
        HumanPlayer p1 = new HumanPlayer(Color.BLUE);
        HumanPlayer p2 = new HumanPlayer(Color.RED);

        Game game = new Game(p1, p2);



    }
}