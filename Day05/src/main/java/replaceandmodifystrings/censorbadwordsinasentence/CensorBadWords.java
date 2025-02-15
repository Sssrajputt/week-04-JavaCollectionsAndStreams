package replaceandmodifystrings.censorbadwordsinasentence;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CensorBadWords {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Define a set of bad words
        Set<String> badWords = new HashSet<>();
        badWords.add("damn");
        badWords.add("stupid");
        // Add more bad words as needed

        // Split the text into words
        String[] words = text.split("\\s+");

        // Use a StringBuilder to store the censored result
        StringBuilder result = new StringBuilder();

        // Iterate over each word in the text
        for (String word : words) {
            if (badWords.contains(word.toLowerCase())) {
                // Replace bad words with "****"
                result.append("****");
            } else {
                // Append non-bad words as they are
                result.append(word);
            }
            result.append(" ");
        }

        // Print the censored sentence
        System.out.println("Censored Sentence: " + result.toString().trim());

        // Close the Scanner
        sc.close();
    }
}
