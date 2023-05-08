package ga.justreddy.wiki.rskywars.skywarsapi.entity.data;

import java.util.List;

public interface SkyWarsCosmetics {

    int getSelectedCage();

    void setSelectedCage(int id);

    List<Integer> getCages();

    void addCage(int id);

    void removeCage(int id);

    int getSelectedDance();

    void setSelectedDance(int id);

    List<Integer> getDances();

    void addDance(int id);

    void removeDance(int id);

    int getSelectedKillEffect();

    void setSelectedKillEffect(int id);

    List<Integer> getKillEffects();

    void addKillEffect(int id);

    void removeKillEffect(int id);

    int getSelectedTrail();

    void setSelectedTrail(int id);

    List<Integer> getTrails();

    int getSelectedKillMessage();

    void addKillMessage(int id);

    void removeKillMessage(int id);

    List<Integer> getKillMessages();

    void addTrail(int id);

    void removeTrail(int id);

}
