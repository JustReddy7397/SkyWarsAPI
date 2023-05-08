package ga.justreddy.wiki.rskywars.skywarsapi.game;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import ga.justreddy.wiki.rskywars.skywarsapi.enums.GameState;
import ga.justreddy.wiki.rskywars.skywarsapi.enums.GameType;
import ga.justreddy.wiki.rskywars.skywarsapi.game.event.GameEvent;
import ga.justreddy.wiki.rskywars.skywarsapi.game.map.GameMap;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;
import java.util.Map;

public interface Game {

    String getName();

    String getDisplayName();

    GameMap getMap();

    GameType getGameType();

    GameState getGameState();

    void setGameState(GameState gameState);

    int getSize();

    int getPlayerCount();

    int getTeamSize();

    int getMinimum();

    int getTimer();

    int getMaximum();

    Location getLobbySpawn();

    Location getSpectatorLocation();

    Cuboid getLobbyCuboid();

    Cuboid getGameCuboid();

    List<GameTeam> getTeams();

    List<GameTeam> getAliveTeams();

    List<SkyWarsPlayer> getPlayers();

    List<SkyWarsPlayer> getAlivePlayers();

    List<SkyWarsPlayer> getSpectatorPlayers();

    Map<Location, String> getChests();

    GameTeam getFreeTeam();

    ConfigurationSection getGameOptions();

    GameEvent getCurrentEvent();

    boolean isFull();

    void sendMessage(String message);

    void sendTitle(String title, String subTitle);

    void sendActionBar(String message);

    void sendSound(String sound);

    void onSkyWarsPlayerJoin(SkyWarsPlayer player);

    void onSkyWarsPlayerJoinSpectator(SkyWarsPlayer player);

    void onSkyWarsPlayerQuit(SkyWarsPlayer player, boolean silent);

    void onSkyWarsPlayerDeath(SkyWarsPlayer killer, SkyWarsPlayer victim, String path);

    void setTeam(SkyWarsPlayer player, GameTeam team);

    void onCountDown();

    void onGamePre();

    void onGameStart();

    void onGameEnd(GameTeam winners);

    void onGameRestart();

    List<Map.Entry<SkyWarsPlayer, Integer>> getTopKillers();

    int getKills(SkyWarsPlayer player);

    void addKill(SkyWarsPlayer player);

    void fill();

    void refill();

    void secondRefill();

    void setHealth(); // TODO

    void setTime(); // TODO

    void setWeather(); // TODO

    void setEnabled(boolean enable);

}
