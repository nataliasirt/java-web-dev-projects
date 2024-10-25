package src.main.java.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Quiz class to manage quiz flow
class Quiz {
    private final List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;

            for (Question question : questions) {
                question.displayQuestion();
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();

                if (question.checkAnswer(userAnswer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            }

            System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
        }
    }
}