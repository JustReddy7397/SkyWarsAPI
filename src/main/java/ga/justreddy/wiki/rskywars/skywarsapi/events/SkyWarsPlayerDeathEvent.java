package ga.justreddy.wiki.rskywars.skywarsapi.events;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;

public class SkyWarsPlayerDeathEvent extends SkyWarsEvent {

    private final Game game;
    private final SkyWarsPlayer killer;
    private final SkyWarsPlayer victim;

    public SkyWarsPlayerDeathEvent(Game game, SkyWarsPlayer killer, SkyWarsPlayer victim) {
        this.game = game;
        this.killer = killer;
        this.victim = victim;
    }

    public Game getGame() {
        return game;
    }

    public SkyWarsPlayer getKiller() {
        return killer;
    }

    public SkyWarsPlayer getVictim() {
        return victim;
    }
}
