package ga.justreddy.wiki.rskywars.skywarsapi.cosmetics;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;

public abstract class KillMessage extends Cosmetic {
    public KillMessage(String name, int id, int cost) {
        super(name, id, cost);
    }

    public abstract void sendVoid(Game game, SkyWarsPlayer killer, SkyWarsPlayer victim);

    public abstract void sendMelee(Game game, SkyWarsPlayer killer, SkyWarsPlayer victim);

    public abstract void sendBow(Game game, SkyWarsPlayer killer, SkyWarsPlayer victim);

    public abstract void sendFallDamage(Game game, SkyWarsPlayer killer, SkyWarsPlayer victim);

}
