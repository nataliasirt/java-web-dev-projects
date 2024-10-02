package org.launchcode.studio;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {

        // declares and initializes a String variable named quote containing the example text. This is the string that you will analyze to count the characters.
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //converts the string quote into an array of characters. The toCharArray() method splits the string into individual characters, making it easier to iterate through each character for counting.
        char[] charArray = quote.toCharArray();
        //initializes a HashMap called counts to store the character counts. The keys of the map are characters (Character), and the values are integers (Integer), representing how many times each character appears.
        HashMap<Character, Integer> counts = new HashMap<>();
        //for-each loop that iterates over each character in the charArray
        for (char letter : charArray) {
            //logic for counting the characters.
            System.out.println(letter);

            if (counts.containsKey(letter)) {
                //If the character is found in the map, counts.get(letter) retrieves its current count, and then counts.put(letter, counts.get(letter) + 1) updates the count by adding 1.
                counts.put(letter, counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }
        //loop iterates over the entries (key-value pairs) in the HashMap
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}