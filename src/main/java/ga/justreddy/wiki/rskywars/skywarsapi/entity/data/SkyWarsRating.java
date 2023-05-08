package ga.justreddy.wiki.rskywars.skywarsapi.entity.data;

import ga.justreddy.wiki.rskywars.skywarsapi.ranked.Division;

public interface SkyWarsRating {

    int getRating();

    void setRating(int rating);

    void addRating();

    void removeRating();

    String getTag();

    Division getLeague();

    int getPosition();

    boolean hasClaimed();

    void setClaimed(boolean claimed);

    int getWinRating();

    int getLossRating();

}
