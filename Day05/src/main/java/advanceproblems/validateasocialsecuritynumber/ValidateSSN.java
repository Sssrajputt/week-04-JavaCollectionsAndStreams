package advanceproblems.validateasocialsecuritynumber;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateSSN {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing an SSN: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Define the regex pattern for a valid SSN
        String ssnPattern = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Use Pattern to compile the regex and match the input text
        Pattern pattern = Pattern.compile(ssnPattern);
        Matcher matcher = pattern.matcher(text);

        // Check for SSN in the input text
        boolean foundSSN = false;
        while (matcher.find()) {
            String ssn = matcher.group();
            System.out.println("✅ \"" + ssn + "\" is valid");
            foundSSN = true;
        }

        if (!foundSSN) {
            System.out.println("❌ No valid SSN found");
        }

        // Close the Scanner
        sc.close();
    }
}
