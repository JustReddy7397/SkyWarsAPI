package ga.justreddy.wiki.rskywars.skywarsapi.cosmetics;

import org.bukkit.entity.Projectile;

public abstract class Trails extends Cosmetic {

    private final String particle;

    public Trails(String name, int id, int cost, String particle) {
        super(name, id, cost);
        this.particle = particle.toUpperCase();
    }

    public String getParticle() {
        return particle;
    }

    public abstract void summon(Projectile projectile);

}
