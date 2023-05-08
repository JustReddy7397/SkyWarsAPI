package ga.justreddy.wiki.rskywars.skywarsapi.game;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;

public interface CombatLog {

    SkyWarsPlayer getAttacker();

    SkyWarsPlayer getTarget();

    boolean hasTarget();

    void setTarget(SkyWarsPlayer target);

    boolean isTimeCorrect();

}
