package src.main.java.questions;

// Subclass | Child class for MultipleChoice questions
class MultipleChoice extends Question {
    private final String[] options;
    private final int correctOptionIndex;

    public MultipleChoice(String questionText, String[] options, int correctOptionIndex) {
        super(questionText, Integer.toString(correctOptionIndex));
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
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
        try {
            int userChoice = Integer.parseInt(userAnswer.trim()) - 1;
            return userChoice == correctOptionIndex;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number corresponding to the options.");
            return false;
        }
    }
}
