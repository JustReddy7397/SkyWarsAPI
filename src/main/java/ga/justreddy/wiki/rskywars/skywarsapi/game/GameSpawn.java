package ga.justreddy.wiki.rskywars.skywarsapi.game;

import ga.justreddy.wiki.rskywars.skywarsapi.cosmetics.Cage;
import org.bukkit.Location;

public interface GameSpawn {

    Location getSpawn();

    void setSpawn(Location location);

    boolean isUsed();

    void setUsed(boolean used);

    Cage getCage();

    void setCage(Cage cage);

}
