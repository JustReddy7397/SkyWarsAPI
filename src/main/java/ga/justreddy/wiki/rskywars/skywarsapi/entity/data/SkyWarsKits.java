package ga.justreddy.wiki.rskywars.skywarsapi.entity.data;

import ga.justreddy.wiki.rskywars.skywarsapi.kit.Kit;
import ga.justreddy.wiki.rskywars.skywarsapi.kit.KitLayOut;

import java.util.List;

public interface SkyWarsKits {

    String getLastUsedKit();

    void setLastUsedKit(String kit);

    List<KitLayOut> getKitLayouts();

    void addKitLayout(KitLayOut kitLayOut);

    KitLayOut getKitLayout(Kit kit);

    void setKitLayout(KitLayOut kitLayOut);

    void removeKitLayout(Kit kit);
}
