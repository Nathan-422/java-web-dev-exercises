package studios.Quiz;

import java.util.Scanner;

public abstract class Question {

    private final String question;
    private final Scanner scanner;

    public Question(String question, Scanner scanner) {
        this.question = question;
        this.scanner = scanner;
    }

    public String getQuestion() {
        return this.question;
    }

    public Scanner getUserInput() {
        return this.scanner;
    }

    public abstract boolean tryAnswer();

    public abstract String getAnswers();
    @Override
    public abstract String toString();

}
