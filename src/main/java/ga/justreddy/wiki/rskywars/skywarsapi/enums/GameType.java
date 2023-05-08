package ga.justreddy.wiki.rskywars.skywarsapi.enums;

public enum GameType {

    SOLO("Solo"),
    TEAM("Team"),
    RANKED("Ranked");

    private final String name;

    GameType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
