package advanceproblems.extractcurrencyvaluefromatext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Define the regex pattern for currency values
        String currencyPattern = "\\$?\\d+\\.\\d{2}";

        // Use Pattern to compile the regex and match the input text
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(text);

        // Use a list to store the extracted currency values
        List<String> currencyValues = new ArrayList<>();

        // Find and store all matching currency values
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print the extracted currency values
        System.out.println("Extracted Currency Values: " + String.join(", ", currencyValues));

        // Close the Scanner
        sc.close();
    }
}
