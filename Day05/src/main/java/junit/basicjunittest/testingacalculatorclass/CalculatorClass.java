package junit.basicjunittest.testingacalculatorclass;

public class CalculatorClass {
    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int subtract(int a,int b){
        int subtract = a - b;
        return subtract;
    }
    public static int multiply(int a,int b){
        int multiply = a * b;
        return multiply;
    }
    public static int divide(int a,int b){
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String args[]){
        int addition = CalculatorClass.add(10,2);
        int subtraction = CalculatorClass.subtract(10,2);
        int multiplication = CalculatorClass.multiply(10,2);
        int division = CalculatorClass.divide(10,2);
        System.out.println("addition: " + addition);
        System.out.println("subtraction: " + subtraction);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);

    }
}
