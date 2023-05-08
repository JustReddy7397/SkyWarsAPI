package ga.justreddy.wiki.rskywars.skywarsapi.game;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;


public class Cuboid {
    public World getWorld() {
        return world;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getZ1() {
        return z1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getZ2() {
        return z2;
    }

    public Location getHighPoints() {
        return highPoints;
    }

    public Location getLowPoints() {
        return lowPoints;
    }

    private final Location highPoints;
    private final Location lowPoints;
    private final World world;
    private final int x1;
    private final int y1;
    private final int z1;
    private final int x2;
    private final int y2;
    private final int z2;

    public Cuboid(Location highPoints, Location lowPoints) {
        this.highPoints = highPoints;
        this.lowPoints = lowPoints;
        this.world = highPoints.getWorld();
        this.x1 = Math.min(highPoints.getBlockX(), lowPoints.getBlockX());
        this.y1 = Math.min(highPoints.getBlockY(), lowPoints.getBlockY());
        this.z1 = Math.min(highPoints.getBlockZ(), lowPoints.getBlockZ());
        this.x2 = Math.max(highPoints.getBlockX(), lowPoints.getBlockX());
        this.y2 = Math.max(highPoints.getBlockY(), lowPoints.getBlockY());
        this.z2 = Math.max(highPoints.getBlockZ(), lowPoints.getBlockZ());
        Location highPoints1 = new Location(this.world, this.x2, this.y2, this.z2);
        Location lowPoints1 = new Location(this.world, this.x1, this.y1, this.z1);
    }

    public boolean contains(Location location) {
        return location.getWorld() == world
                && location.getBlockX() >= x1
                && location.getBlockX() <= x2
                && location.getBlockY() <= y2
                && location.getBlockZ() >= z1
                && location.getBlockZ() <= z2;
    }

    public void clear() {
        for(int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                for (int z = z1; z < z2; z++) {
                    Block block = this.world.getBlockAt(x, y, z);
                    if (block.getType() != Material.AIR) {
                        block.setType(Material.AIR);
                    }
                }
            }
        }
    }



}
