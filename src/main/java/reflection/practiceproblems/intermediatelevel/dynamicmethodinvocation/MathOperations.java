package reflection.practiceproblems.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        try {
            MathOperations operations = new MathOperations();
            Method method = MathOperations.class.getDeclaredMethod(methodName, int.class, int.class);

            int result = (int) method.invoke(operations, 5, 3);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
