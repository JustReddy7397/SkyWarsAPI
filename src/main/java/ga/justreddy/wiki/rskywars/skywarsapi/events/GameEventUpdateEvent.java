package ga.justreddy.wiki.rskywars.skywarsapi.events;

import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;
import ga.justreddy.wiki.rskywars.skywarsapi.game.event.GameEvent;

public class GameEventUpdateEvent extends SkyWarsEvent {

    private final Game game;
    private final GameEvent newEvent;
    private final GameEvent oldEvent;

    public GameEventUpdateEvent(Game game, GameEvent newEvent, GameEvent oldEvent) {
        this.game = game;
        this.newEvent = newEvent;
        this.oldEvent = oldEvent;
    }

    public Game getGame() {
        return game;
    }

    public GameEvent getNewEvent() {
        return newEvent;
    }

    public GameEvent getOldEvent() {
        return oldEvent;
    }

}
