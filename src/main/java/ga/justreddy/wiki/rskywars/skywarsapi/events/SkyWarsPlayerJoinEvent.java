package ga.justreddy.wiki.rskywars.skywarsapi.events;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;

public class SkyWarsPlayerJoinEvent extends SkyWarsEvent {

    private final Game game;
    private final SkyWarsPlayer player;

    public SkyWarsPlayerJoinEvent(Game game, SkyWarsPlayer player) {
        this.game = game;
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public SkyWarsPlayer getPlayer() {
        return player;
    }

}
