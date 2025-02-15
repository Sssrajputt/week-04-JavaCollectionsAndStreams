package advanceproblems.findrepeatingwordsinasentence;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatingWords {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        // Read the input from the user
        String text = sc.nextLine();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Use a HashMap to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate over each word in the text
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Print the repeating words
        System.out.println("Repeating Words:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        // Close the Scanner
        sc.close();
    }
}
