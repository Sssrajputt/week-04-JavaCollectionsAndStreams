package reflection.practiceproblems.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Student");

            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            Object student = constructor.newInstance("John");

            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
