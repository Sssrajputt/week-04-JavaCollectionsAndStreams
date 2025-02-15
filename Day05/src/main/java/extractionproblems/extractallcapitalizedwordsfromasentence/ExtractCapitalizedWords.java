package extractionproblems.extractallcapitalizedwordsfromasentence;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Regular expression to match capitalized words
        String regex = "\\b[A-Z][a-zA-Z]*\\b";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher to find all occurrences of capitalized words in the text
        Matcher matcher = pattern.matcher(text);

        // Use a StringBuilder to store the results
        StringBuilder result = new StringBuilder();

        // Use matcher.find() to find all capitalized words in the text
        while (matcher.find()) {
            // Append each capitalized word found to the result
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group());
        }

        // Print the extracted capitalized words
        System.out.println("Capitalized Words: " + result.toString());

        // Close the Scanner
        sc.close();
    }
}
