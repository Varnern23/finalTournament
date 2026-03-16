package main;
import java.util.List;

public abstract class Tournament {

    Game game;
    List<Robot> players;

    public Tournament(Game game, List<Robot> players) {
        this.game = game;
        this.players = players;
    }

    public abstract Robot run(Robot r1, Robot r2);

    public abstract List<Robot> getBracket();

    public abstract String checkEnd();
}
