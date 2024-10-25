package src.main.java.questions;

// Base class | Parent class
public abstract class Question {
    private final String questionText;
    private final String answer;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }
    public String getQuestionText() {
        return questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String userAnswer);
}


