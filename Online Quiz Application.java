import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Quiz!");
        System.out.println("Answer the following questions:");

        for (Question question : questions) {
            System.out.println("\n" + question.getQuestion());
            System.out.println("Options:");
            question.displayOptions();

            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + " out of " + questions.size());
    }
}






public class Question {
    private String question;
    private String[] options;
    private String correctAnswer;

    public Question(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void displayOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}






import java.util.ArrayList;
import java.util.List;

public class OnlineQuizApp {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, "Paris"));
        questions.add(new Question("Which programming language is used for Android app development?",
                new String[]{"Java", "Python", "C#", "Kotlin"}, "Kotlin"));
        questions.add(new Question("What is the largest planet in our solar system?",
                new String[]{"Earth", "Jupiter", "Mars", "Venus"}, "Jupiter"));

        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
    }
}
