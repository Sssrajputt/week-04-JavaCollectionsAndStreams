package reflection.advancedlevel.createacustomobjectmapper;

public class Person {
    private String name;
    private int age;
    private String address;

    // Getters and setters for fields (optional for this example)

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}
