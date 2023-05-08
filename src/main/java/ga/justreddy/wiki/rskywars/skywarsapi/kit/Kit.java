package ga.justreddy.wiki.rskywars.skywarsapi.kit;

import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Kit {

    String getName();

    List<ItemStack> getKitItems();

    void setKitItems(List<ItemStack> kitItems);

    List<ItemStack> getArmorItems();

    void setArmorItems(List<ItemStack> armorItems);

    ItemStack getGuiKitItem();

    boolean isDefault();

    void setDefault(boolean $default);

    void equipKit(SkyWarsPlayer player);

    void setGuiKitItem(Material kitItem);



}
