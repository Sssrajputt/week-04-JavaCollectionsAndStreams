package reflection.practiceproblems.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Get the Configuration class
        Class<Configuration> configClass = Configuration.class;

        // Get the API_KEY field
        Field apiKeyField = configClass.getDeclaredField("API_KEY");

        // Make the field accessible
        apiKeyField.setAccessible(true);

        // Modify the value of the static field
        apiKeyField.set(null, "new_api_key");

        // Print the modified value
        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
    }
}
