package ga.justreddy.wiki.rskywars.skywarsapi;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public interface ISkyWarsAPI {

    SkyWarsPlayer getSkyWarsPlayer(UUID uuid);

    SkyWarsPlayer loadOffline(String name);

    SkyWarsPlayer loadOffline(UUID uuid);

    Plugin getPlugin();

}
