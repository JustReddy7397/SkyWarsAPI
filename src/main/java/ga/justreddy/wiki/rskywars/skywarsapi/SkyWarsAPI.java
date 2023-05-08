package ga.justreddy.wiki.rskywars.skywarsapi;

public final class SkyWarsAPI {

    private static ISkyWarsAPI api;

    public static void setApi(ISkyWarsAPI api) {
        SkyWarsAPI.api = api;
    }

    public static ISkyWarsAPI getApi() {
        if (api == null) throw new IllegalStateException("SkyWarsAPI not initialized");
        return api;
    }
}
