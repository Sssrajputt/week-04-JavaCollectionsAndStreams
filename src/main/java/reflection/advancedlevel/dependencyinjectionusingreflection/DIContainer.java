package reflection.advancedlevel.dependencyinjectionusingreflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private Map<Class<?>, Object> instances = new HashMap<>();

    // Method to register a class and create its instance
    public void register(Class<?> clazz) throws InstantiationException, IllegalAccessException {
        Object instance = clazz.newInstance();
        instances.put(clazz, instance);
    }

    // Method to inject dependencies
    public void injectDependencies() throws IllegalAccessException {
        for (Object instance : instances.values()) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency = instances.get(field.getType());
                    field.set(instance, dependency);
                }
            }
        }
    }

    // Method to get an instance of a class
    public <T> T getInstance(Class<T> clazz) {
        return (T) instances.get(clazz);
    }
}
