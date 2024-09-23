package org.launchcode.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Step 2: Loop through and print all values
        System.out.println("All values:");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        // Step 3: Loop through and print only odd numbers
        System.out.println("\nOdd values:");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
        // Step 1: Define the string
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. "
                + "I will not eat them in a house. I will not eat them with a mouse.";

        // Step 2: Split the string at each space
        String[] words1 = sentence.split(" ");
        String[] words2 = sentence.split("\\.");


        // Step 3: Loop through the array and print each word
//        for (String word : words1) {
//            System.out.println(word);
            System.out.println(Arrays.toString(words1));
        System.out.println(Arrays.toString(words2));
        }
    }
