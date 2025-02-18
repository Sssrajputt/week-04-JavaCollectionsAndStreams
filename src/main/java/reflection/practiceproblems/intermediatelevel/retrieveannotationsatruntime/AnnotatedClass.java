package reflection.practiceproblems.intermediatelevel.retrieveannotationsatruntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "John Doe")
public class AnnotatedClass {

    public static void main(String[] args) {
        try {
            Class<?> clazz = AnnotatedClass.class;

            if (clazz.isAnnotationPresent(Author.class)) {
                Author author = clazz.getAnnotation(Author.class);
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No Author annotation present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
