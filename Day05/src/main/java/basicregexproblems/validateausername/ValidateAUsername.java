import java.util.Scanner;
import java.util.regex.*;

public class ValidateAUsername {
    public static void main(String args[]) {

        // Regular expression to match valid usernames
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Username: ");

        // Read the input from the user
        String input = sc.nextLine();

        // Create a matcher to compare the input against the pattern
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        if (matcher.matches()) {
            // If it matches, print that the username is valid
            System.out.println("Valid username: " + input);
        } else {
            // If it doesn't match, print that the username is invalid
            System.out.println("Invalid username: " + input);
        }
    }
}
