package ga.justreddy.wiki.rskywars.skywarsapi.game.map;

import org.bukkit.World;

public interface GameMap {

    boolean load();

    void unload();

    boolean isLoaded();

    boolean restoreFromSource();

    World getWorld();

}
