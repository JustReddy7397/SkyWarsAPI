package ga.justreddy.wiki.rskywars.skywarsapi.kit;

import org.bukkit.inventory.ItemStack;

import java.util.Map;

public interface KitLayOut {

    String getKitName();

    Map<Integer, ItemStack> getItemsLayout();

    void setItemsLayout(Map<Integer, ItemStack> itemsLayout);

}
