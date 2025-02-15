package basicregexproblems.validateahexcolorcode;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateHexColor {
    public static void main(String args[]) {

        // Regular expression to match valid hex color code
        String regex = "^#[0-9A-Fa-f]{6}$";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hex Color Code: ");

        // Read the input from the user
        String input = sc.nextLine();

        // Create a matcher to compare the input against the pattern
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        if (matcher.matches()) {
            // If it matches, print that the hex color code is valid
            System.out.println("Valid hex color code: " + input);
        } else {
            // If it doesn't match, print that the hex color code is invalid
            System.out.println("Invalid hex color code: " + input);
        }

        // Close the Scanner
        sc.close();
    }
}
