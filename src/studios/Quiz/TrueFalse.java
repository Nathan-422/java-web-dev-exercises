package studios.Quiz;

import java.util.Scanner;

public class TrueFalse extends Question {

    private final boolean answer;
    private final Scanner scanner;

    public TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public boolean tryAnswer() {

        while (true) {

            System.out.println(super.getQuestion() + "\n\nChoose an answer:\n1) True\n2)False");

            int userInput;

            try {
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Input must be 1 or 2");
                continue;
            }

            boolean userAnswer;

            userAnswer = userInput == 1;

            return answer == userAnswer;

        }
    }

    @Override
    public String getAnswers() {
        return "1) True\n2)False";
    }

    @Override
    public String toString() {
        return super.getQuestion();
    }

}
