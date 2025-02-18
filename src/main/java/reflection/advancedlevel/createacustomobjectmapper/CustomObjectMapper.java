package reflection.advancedlevel.createacustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws InstantiationException, IllegalAccessException {
        // Create a new instance of the class
        T instance = clazz.newInstance();

        // Iterate over the entries in the properties map
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                // Get the field corresponding to the property key
                Field field = clazz.getDeclaredField(entry.getKey());
                // Make the field accessible
                field.setAccessible(true);
                // Set the value of the field in the instance
                field.set(instance, entry.getValue());
            } catch (NoSuchFieldException e) {
                // Handle the case where the field does not exist
                System.err.println("No such field: " + entry.getKey());
            }
        }
        return instance;
    }
}
