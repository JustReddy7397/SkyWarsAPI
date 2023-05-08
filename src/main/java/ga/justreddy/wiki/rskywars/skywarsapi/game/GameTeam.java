package ga.justreddy.wiki.rskywars.skywarsapi.game;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;

import java.util.List;

public interface GameTeam {

    String getId();

    void setId(String id);

    List<SkyWarsPlayer> getPlayers();

    List<GameSpawn> getSpawns();

    GameSpawn getFreeSlot();

    void addPlayer(SkyWarsPlayer player);

    boolean hasPlayer(SkyWarsPlayer player);

    void removePlayer(SkyWarsPlayer player);

    int getSize();

    boolean isFull();

    List<SkyWarsPlayer> getAlive();

    List<SkyWarsPlayer> getDead();


}
