package src.main.java.questions;

// Main class to run the quiz
public class QuizRunner {
    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz();

        // Add questions
        quiz.addQuestion(new MultipleChoice("What is the capital of France?", new String[]{"Paris", "Berlin", "London", "Rome"}, 0));
        quiz.addQuestion(new Checkbox("Which of the following are fruits?", new String[]{"Apple", "Carrot", "Banana", "Tomato"}, new boolean[]{true, false, true, false}));
        quiz.addQuestion(new TrueFalse("Is the sky blue?", true));

        // Run the quiz
        quiz.runQuiz();
    }
}