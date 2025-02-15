package basicregexproblems.validatealicenseplatenumber;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateLicensePlate {
    public static void main(String args[]) {

        // Regular expression to match valid license plate format
        String regex = "^[A-Z]{2}[0-9]{4}$";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a License Plate: ");

        // Read the input from the user
        String input = sc.nextLine();

        // Create a matcher to compare the input against the pattern
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        if (matcher.matches()) {
            // If it matches, print that the license plate is valid
            System.out.println("Valid license plate: " + input);
        } else {
            // If it doesn't match, print that the license plate is invalid
            System.out.println("Invalid license plate: " + input);
        }
    }
}
