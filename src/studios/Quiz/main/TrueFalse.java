package studios.Quiz;

import java.util.Scanner;

public class TrueFalse extends Question {

    private final boolean answer;
    public TrueFalse(String question, Scanner scanner, boolean answer) {
        super(question, scanner);
        this.answer = answer;
    }

    @Override
    public boolean tryAnswer() {


//        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(super.getQuestion() + "\n\nChoose an answer:\n" + this.getAnswers());

            int userInput;


            try {
                userInput = Integer.parseInt(super.getUserInput().nextLine());
            } catch (Exception e) {
                System.out.println("Input must be 1 or 2");
                continue;
            }

            // Note: There can only be one scanner reading System.in at a time, so we must close these
            // or pass a scanner object to the constructor that can be shared between all classes.
//            scanner.close();

            boolean userAnswer;

            userAnswer = userInput == 1;

            return answer == userAnswer;

        }
    }

    @Override
    public String getAnswers() {
        return "1) True\n2) False";
    }

    @Override
    public String toString() {
        return super.getQuestion();
    }

}
