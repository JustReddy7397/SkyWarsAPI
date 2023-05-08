package ga.justreddy.wiki.rskywars.skywarsapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class SkyWarsEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
