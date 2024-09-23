package org.launchcode.exercises;

import java.util.ArrayList;

public class ArrayListInteger {

    // Step 1: Define the static method to find the sum of even numbers
    public static int findSumOfEvens(ArrayList<Integer> numbers) {
        int sum = 0;

        // Step 2: Loop through the ArrayList and add even numbers to sum
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        // Step 3: Return the sum of even numbers
        return sum;
    }

    public static void main(String[] args) {
        // Step 4: Create an ArrayList with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Step 5: Call the findSumOfEvens method and print the result. In this case, the even numbers are 2, 4, 6, 8, 10, and their sum is 30.
        int sumOfEvens = findSumOfEvens(numbers);
        System.out.println("The sum of even numbers is: " + sumOfEvens);
    }
}
