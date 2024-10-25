package src.main.java.questions;

import java.util.Arrays;

// Subclass | Child class for Checkbox questions
class Checkbox extends Question {
    private final String[] options;
    private final boolean[] correctChoices;

    public Checkbox(String questionText, String[] options, boolean[] correctChoices) {
        super(questionText, "");
        this.options = options;
        this.correctChoices = correctChoices;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        // Normalize user input
        String[] userChoices = userAnswer.trim().toLowerCase().split("\\s*,\\s*");

        // Create an array to track user selections
        boolean[] userSelections = new boolean[options.length];

        try {
            // Mark user's selected choices
            for (String choice : userChoices) {
                int index = Integer.parseInt(choice) - 1;
                if (index >= 0 && index < options.length) {
                    userSelections[index] = true;
                } else {
                    System.out.println("Invalid choice: " + choice);
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter numbers separated by commas.");
            return false;
        }

        // Compare user selections with correct choices
        return Arrays.equals(userSelections, correctChoices);
    }
}
