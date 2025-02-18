package reflection.advancedlevel.generateajsonrepresentation;

public class Main {
    public static void main(String[] args) {
        // Create a sample Person object
        Person person = new Person("John Doe", 30, "123 Main St");

        // Convert the Person object to a JSON-like string
        String jsonString = JsonConverter.toJson(person);

        // Print the JSON-like string
        System.out.println(jsonString);
    }
}
