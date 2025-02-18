package reflection.advancedlevel.createacustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // Define properties to set on the Person object
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);
        properties.put("address", "123 Main St");

        // Use the CustomObjectMapper to create and populate a Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Print the resulting Person object
        System.out.println(person);
    }
}
