package ga.justreddy.wiki.rskywars.skywarsapi.events;

import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;

public class GameStartEvent extends SkyWarsEvent {

    private final Game game;

    public GameStartEvent(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

}
