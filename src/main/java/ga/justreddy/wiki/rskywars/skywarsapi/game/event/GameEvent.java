package ga.justreddy.wiki.rskywars.skywarsapi.game.event;

import ga.justreddy.wiki.rskywars.skywarsapi.game.Game;
import org.bukkit.Location;

public abstract class GameEvent implements Cloneable {

    protected Game game;
    protected String name;
    protected boolean enabled;
    protected int time;

    public GameEvent(String name, boolean enabled) {
        this.name = name;
        this.enabled = enabled;
    }

    public abstract void start();

    public abstract void stop();

    public void update() {
        if (time > 0) time--;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public GameEvent clone() {
        try {
            return (GameEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }
}
