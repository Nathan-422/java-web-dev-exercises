package studios.Quiz.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkbox extends Question {

    private final String[] possibleAnswers;
    private final String[] correctAnswers;
    private final boolean[] checkedAnswers;

    public Checkbox(String question, Scanner scanner, String[] possibleAnswers, String[] correctAnswers) {
        super(question, scanner);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;

        this.checkedAnswers = new boolean[possibleAnswers.length];

        // not sure if this is necessary, or not.
        for (boolean b : checkedAnswers) {
            b = false;
        }

    }

    private String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    private boolean[] getCheckedAnswers() {
        return checkedAnswers;
    }

    private String[] getCorrectAnswers() {
        return correctAnswers;
    }

    @Override
    public String getAnswers() {

        int i = 1;
        StringBuilder sb = new StringBuilder();

        for (String question : this.getPossibleAnswers()) {
            char boolToLetter = (this.getCheckedAnswers()[i - 1]) ? 'X' : ' ';

            sb.append(i).append(") [").append(boolToLetter).append("] ");
            sb.append(question).append('\n');
            i++;
        }

        return sb.toString();
    }

    @Override
    public boolean tryAnswer() {

        while (true) {
            System.out.println(this.getQuestion());
            System.out.println("Select a box to check or uncheck: ");
            System.out.println("0) Finished answering");
            System.out.println(this.getAnswers());

            int userChoice;
            final int EXIT_VALUE = 0;

            // get input
            try {
                userChoice = Integer.parseInt(super.getUserInput().nextLine());
            } catch (Exception e) {
                System.out.println("Input must be a number between 0 and " + this.getPossibleAnswers().length);
                continue;
            }

            // value out of range
            if (userChoice < 0 || userChoice > this.getPossibleAnswers().length) {
                System.out.println("Please keep entries between 0 and " + this.getPossibleAnswers().length);
                continue;
            }

            // exit condition
            if (userChoice == EXIT_VALUE) {
                break;
            }

            // the moneymaker
            final int selectionZeroIndexed = userChoice -1;
            this.getCheckedAnswers()[selectionZeroIndexed] = !this.getCheckedAnswers()[selectionZeroIndexed];

        }

        int totalSelectedAnswers = 0;

        for (Boolean b : this.getCheckedAnswers()) {
            if (b) {totalSelectedAnswers++;}
        }

        // early return
        if (totalSelectedAnswers != this.getCorrectAnswers().length) {
            return false;
        }

        ArrayList<String> answers = new ArrayList<>(List.of(this.getCorrectAnswers()));

        for (int i = 0; i < this.getPossibleAnswers().length; i++) {

            boolean isChecked = this.getCheckedAnswers()[i];
            String option = this.getPossibleAnswers()[i];

            if (isChecked && !answers.contains(option)) {
                return false;
            }

        }

        return true;
    }

}
