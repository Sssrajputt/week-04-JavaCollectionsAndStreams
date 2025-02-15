package extractionproblems.extractdatesformat;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractDates {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Regular expression to match dates in dd/mm/yyyy format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher to find all occurrences of the dates in the text
        Matcher matcher = pattern.matcher(text);

        // Use a StringBuilder to store the results
        StringBuilder result = new StringBuilder();

        // Use matcher.find() to find all dates in the text
        while (matcher.find()) {
            // Append each date found to the result
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(matcher.group());
        }

        // Print the extracted dates
        System.out.println("Dates: " + result.toString());

        // Close the Scanner
        sc.close();
    }
}
