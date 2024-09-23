package org.launchcode;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
    // Step 1: Define the static method to print words with a specified length
    public static void printWordsOfLength(ArrayList<String> words, int length) {
        // Step 2: Loop through the list and check the length of each word
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);  // Print the word if it matches the specified length
            }
        }
    }

    public static void main(String[] args) {
        // Step 3: Create an ArrayList of words
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("pear");
        words.add("mango");
        words.add("plums");
        words.add("lemon");

        // Step 4: Prompt the user to enter the word length for search
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word length to search for: ");
        int length = input.nextInt();  // Capture user input

        // Step 5: Call the method to print words of the specified length
        System.out.println("Words with exactly " + length + " letters:");
        printWordsOfLength(words, length);

        input.close();  // Close the scanner
    }
}
