package ga.justreddy.wiki.rskywars.skywarsapi.events;

import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;
import ga.justreddy.wiki.rskywars.skywarsapi.game.GameTeam;

public class GameEndEvent extends SkyWarsEvent {

    private final Game game;
    private final GameTeam winnerTeam;


    public GameEndEvent(Game game, GameTeam winnerTeam) {
        this.game = game;
        this.winnerTeam = winnerTeam;
    }

    public Game getGame() {
        return game;
    }

    public GameTeam getWinnerTeam() {
        return winnerTeam;
    }

}
