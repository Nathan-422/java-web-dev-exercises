package studios.Quiz.main;

import java.util.Scanner;

public class MultipleChoice extends Question {

    private final String[] possibleAnswers;
    private final String correctAnswer;

    public MultipleChoice(String question, Scanner scanner, String[] possibleAnswers, String correctAnswer) {
        super(question, scanner);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    private String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    private String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String getAnswers() {
        StringBuilder sb = new StringBuilder();
        final int numOfAnswers = this.getPossibleAnswers().length;

        int index = 1;
        for (String answer : this.getPossibleAnswers()) {
            sb.append(index).append(") ").append(answer);

            // TODO check that this is working correctly.
            if (index < numOfAnswers) {
                sb.append("\n");
            }

            index++;
        }

        return sb.toString();

    }

    @Override
    public boolean tryAnswer() {

        final int numOfAnswers = this.getPossibleAnswers().length;
        int userChoice = -1;

        while (true) {
            System.out.println(super.getQuestion());
            System.out.println("Choose an answer from the list below: ");
            System.out.println(this.getAnswers());

            try {
                userChoice = Integer.parseInt(super.getUserInput().nextLine());
            } catch (Exception e) {
                System.out.println("Input must be a number between 1 and " + numOfAnswers);
                continue;
            }

            if (userChoice > 0 && userChoice <= numOfAnswers) {
                break;
            }

            System.out.print("Whoops! Please try again. ");

        }

        return this.getCorrectAnswer().equals(this.getPossibleAnswers()[userChoice - 1]);
    }

}
