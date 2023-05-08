package ga.justreddy.wiki.rskywars.skywarsapi.cosmetics;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;

public abstract class KillEffect extends Cosmetic {

    public KillEffect(String name, int id, int cost) {
        super(name, id, cost);
    }

    public abstract void execute(SkyWarsPlayer killer, SkyWarsPlayer victim);

}
