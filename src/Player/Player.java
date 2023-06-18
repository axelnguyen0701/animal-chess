package Player;

import pieces.Color;

public abstract class Player {
    private final Color color;
    private final boolean humanPlayer;

    public Player(Color color, boolean humanPlayer) {
        this.color = color;
        this.humanPlayer = humanPlayer;
    }

    public Color getColor() {
        return color;
    }

    public boolean isHumanPlayer() {
        return humanPlayer;
    }
}
