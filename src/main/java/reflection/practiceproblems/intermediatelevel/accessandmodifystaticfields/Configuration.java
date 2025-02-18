package reflection.practiceproblems.intermediatelevel.accessandmodifystaticfields;

public class Configuration {
    private static String API_KEY = "original_key";

    public static String getApiKey() {
        return API_KEY;
    }
}
