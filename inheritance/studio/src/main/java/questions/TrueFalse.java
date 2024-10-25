package src.main.java.questions;

// Subclass | Child class for True/False questions
class TrueFalse extends Question {
    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText, Boolean.toString(correctAnswer));
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
        System.out.println("True or False?");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(getAnswer());
    }
}