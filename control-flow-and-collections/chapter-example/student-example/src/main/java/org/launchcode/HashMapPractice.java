package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store student ID and name
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;


        System.out.println("Enter your students (or ENTER to finish):");

        // Step 2: Take student names and IDs as input in a loop. The loop continues to prompt the user to enter a student name and ID until an empty string is entered for the name.
        do {

            System.out.print("Student name: ");
            newStudent = input.nextLine();

            // Check if the input is not empty to add the student to the roster

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();  // Get the student ID as an integer
                // Add the ID and name to the classRoster HashMap
                classRoster.put(newID, newStudent);

                // Read in the newline before looping back
                input.nextLine(); // Consume the newline character left by nextInt()
            }

        } while(!newStudent.equals("")); // Exit when an empty name is entered

        // Step 3: Close the Scanner
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        // Step 5: Print the total number of students
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
