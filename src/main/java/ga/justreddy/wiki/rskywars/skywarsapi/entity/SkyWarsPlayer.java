package ga.justreddy.wiki.rskywars.skywarsapi.entity;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.data.SkyWarsKits;
import ga.justreddy.wiki.rskywars.skywarsapi.entity.data.SkyWarsCosmetics;
import ga.justreddy.wiki.rskywars.skywarsapi.entity.data.SkyWarsRating;
import ga.justreddy.wiki.rskywars.skywarsapi.entity.data.SkyWarsStats;
import ga.justreddy.wiki.rskywars.skywarsapi.game.CombatLog;
import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;
import ga.justreddy.wiki.rskywars.skywarsapi.game.GameSpawn;
import ga.justreddy.wiki.rskywars.skywarsapi.game.GameTeam;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface SkyWarsPlayer {

    UUID getUniqueId();

    String getName();

    String getNickedName();

    Player getPlayer();

    SkyWarsStats getStats();

    void setStats(SkyWarsStats stats);

    SkyWarsRating getRanked();

    void setRanked(SkyWarsRating rating);

    SkyWarsCosmetics getCosmetics();

    void setCosmetics(SkyWarsCosmetics cosmetics);

    SkyWarsKits getKits();

    void setKits(SkyWarsKits kits);

    boolean isDead();

    void setDead(boolean dead);

    Game getGame();

    void setGame(Game game);

    GameTeam getTeam();

    void setTeam(GameTeam team);

    GameSpawn getGameSpawn();

    void setGameSpawn(GameSpawn spawn);

    CombatLog getCombatLog();

    void setCombatLog(CombatLog combatLog);

    void sendMessage(String message);

    void sendTitle(String title, String subTitle);

    void sendActionBar(String message);

    void sendSound(String sound);

    void teleport(Location location);

}
