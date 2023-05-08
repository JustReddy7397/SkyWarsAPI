package ga.justreddy.wiki.rskywars.skywarsapi.cosmetics;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public abstract class Cage extends Cosmetic {

    private final FileConfiguration configuration;

    public Cage(String name, int id, int cost, File file) {
        super(name, id, cost);
        this.configuration = YamlConfiguration.loadConfiguration(file);
    }

    public FileConfiguration getConfiguration() {
        return configuration;
    }

    public abstract void create(Location location);

    public abstract void remove(Location location);

}
