package reflection.practiceproblems.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            // Get the value of the private field
            int age = (int) ageField.get(person);
            System.out.println("Age before modification: " + age);

            // Set the value of the private field
            ageField.set(person, 30);
            age = (int) ageField.get(person);
            System.out.println("Age after modification: " + age);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
