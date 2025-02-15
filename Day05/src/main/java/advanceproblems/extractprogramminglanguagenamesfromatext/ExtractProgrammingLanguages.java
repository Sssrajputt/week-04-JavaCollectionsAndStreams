package advanceproblems.extractprogramminglanguagenamesfromatext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Define a set of known programming languages
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Go");
        // Add more languages as needed

        // Create a pattern to match the programming languages in the text
        String regex = String.join("|", languages);
        Pattern pattern = Pattern.compile("\\b(" + regex + ")\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Use a set to store the extracted programming languages
        Set<String> extractedLanguages = new HashSet<>();

        // Find and store all matching programming languages
        while (matcher.find()) {
            extractedLanguages.add(matcher.group());
        }

        // Print the extracted programming languages
        System.out.println("Extracted Programming Languages: " + String.join(", ", extractedLanguages));

        // Close the Scanner
        sc.close();
    }
}
