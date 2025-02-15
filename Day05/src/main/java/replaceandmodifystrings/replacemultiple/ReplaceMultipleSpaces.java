package replaceandmodifystrings.replacemultiple;


import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Replace multiple spaces with a single space
        String result = text.replaceAll("\\s+", " ");

        // Print the result
        System.out.println("Result: " + result);

        // Close the Scanner
        sc.close();
    }
}
