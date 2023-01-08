package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {

    // 3.7.2.1
    public static int sumEven(ArrayList<Integer> list) {
        int sum = 0;

        for (int element : list) {
            if (element % 2 == 0) {
                sum += element;
            }
        }

        return sum;
    }

    // 3.7.2.2
    public static void printFiveLetterWords(ArrayList<String> list) {
        printWordsOfGivenLength(list, 5);
    }

    // 3.7.2.3
    public static void printWordsOfGivenLength(ArrayList<String> list, int wordLengthToPrint) {
        for (String word : list) {
            if (word.length() == wordLengthToPrint) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {

        // 3.7.1.1
        int[] ints = {1, 1, 2, 3, 5, 8};

        // 3.7.1.2
        boolean printOnlyOdd = true;

        if (printOnlyOdd) {
            for (int i : ints) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i : ints) {
                System.out.println(i);
            }
        }

        // 3.7.1.3
        String aliceText = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] spaceSplit = aliceText.split(" ");

        // 3.7.1.4
        System.out.println(Arrays.toString(spaceSplit));

        // 3.7.1.5
        String[] sentenceSplit = aliceText.split("\\. ");
        System.out.println(Arrays.toString(sentenceSplit));

        // 3.7.2.1
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intList.add((int) (Math.random() * 10));
        }

//        System.out.println(intList.toString());
        System.out.println(sumEven(intList));

        // 3.7.2.2
        String[] wordsOfVariousLength = {"I", "do", "not", "want", "fleas"};
        printFiveLetterWords(new ArrayList<String>(Arrays.asList(wordsOfVariousLength)));

        // 3.7.2.3
        int numberOfLettersToPrint = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number that will be used to print words of that length: ");

            if (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Input must be a number.");
                continue;
            }

            numberOfLettersToPrint = input.nextInt();

            // exit statement
            if (numberOfLettersToPrint > 0) {
                break;
            }

            System.out.println("Number must be greater than zero.");

        }
        input.close();

//        printWordsOfGivenLength(new ArrayList<String>(Arrays.asList(wordsOfVariousLength)), numberOfLettersToPrint);

        // 3.7.2.4
        printWordsOfGivenLength(new ArrayList<String>(Arrays.asList(spaceSplit)), numberOfLettersToPrint);


    }

}
