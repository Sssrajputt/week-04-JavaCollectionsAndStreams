package extractionproblems.extractallemailaddressesfromatext;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractAllEmailAddressesFromAText {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Regular expression to match email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher to find all occurrences of email addresses in the text
        Matcher matcher = pattern.matcher(text);

        // Use matcher.find() to find all email addresses in the text
        while (matcher.find()) {
            // Print each email address found
            System.out.println("Email Found: " + matcher.group());
        }

        // Close the Scanner
        sc.close();
    }
}
