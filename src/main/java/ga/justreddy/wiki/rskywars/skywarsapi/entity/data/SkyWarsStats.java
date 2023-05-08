package ga.justreddy.wiki.rskywars.skywarsapi.entity.data;

import ga.justreddy.wiki.rskywars.skywarsapi.enums.GameType;

public interface SkyWarsStats {

    int getGamesWon();

    int getGamesWonSolo();

    int getGamesWonTeam();

    int getGamesWonRanked();

    void setGamesWon(GameType gameType, int amount);

    void addGamesWon(GameType gameType, int amount);

    void addGamesWonRanked(int amount);

    void removeGamesWon(GameType gameType, int amount);

    void removeGamesWonRanked(int amount);

    int getDeaths();

    int getDeathsSolo();

    int getDeathsTeam();

    int getDeathsRanked();

    void setDeaths(GameType gameType, int amount);

    void addDeaths(GameType gameType, int amount);

    void addDeathsRanked(int amount);

    void removeDeaths(GameType gameType, int amount);

    void removeDeathsRanked(int amount);

    int getGamesLost();

    int getGamesLostSolo();

    int getGamesLostTeam();

    int getGamesLostRanked();

    void setGamesLost(GameType gameType, int amount);

    void addGamesLost(GameType gameType, int amount);

    void addGamesLostRanked(int amount);

    void removeGamesLost(GameType gameType, int amount);

    void removeGamesLostRanked(int amount);

    int getGamesPlayed();

    int getGamesPlayedSolo();

    int getGamesPlayedTeam();

    int getGamesPlayedRanked();

    void setGamesPlayed(GameType gameType, int amount);

    void addGamesPlayed(GameType gameType, int amount);

    void addGamesPlayedRanked(int amount);

    void removeGamesPlayed(GameType gameType, int amount);

    void removeGamesPlayedRanked(int amount);

    int getKills();

    int getKillsSolo();

    int getKillsTeam();

    int getKillsRanked();

    void setKills(GameType gameType, int amount);

    void setKillsRanked(int amount);

    void addKills(GameType gameType, int amount);

    void addKillsRanked(int amount);

    void removeKills(GameType gameType, int amount);

    void removeKillsRanked(int amount);

    int getArrowsShot();

    void setArrowsShot(int amount);

    void addArrowsShot(int amount);

    void removeArrowsShot(int amount);

    int getArrowsHit();

    void setArrowsHit(int amount);

    void addArrowsHit(int amount);

    void removeArrowsHit(int amount);

    int getBlocksBroke();

    void setBlocksBroke(int amount);

    void addBlocksBroke(int amount);

    void removeBlocksBroke(int amount);

    int getBlocksPlaced();

    void setBlocksPlaced(int amount);

    void addBlocksPlaced(int amount);

    void removeBlocksPlaced(int amount);

}
