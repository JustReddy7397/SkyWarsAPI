package ga.justreddy.wiki.rskywars.skywarsapi.cosmetics;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;

public abstract class VictoryDance extends Cosmetic {

    public VictoryDance(String name, int id, int cost) {
        super(name, id, cost);
    }

    public abstract void start(SkyWarsPlayer winner);

    public abstract void stop(SkyWarsPlayer winner);

}
