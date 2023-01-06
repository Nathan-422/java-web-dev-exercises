package exercises.ch2;

import java.util.Scanner;

public class AliceInWonderlandSearch {

    private static String aliceText =
            "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                    "and of having nothing to do: once or twice she had peeped into the book her " +
                    "sister was reading, but it had no pictures or conversations in it, 'and what " +
                    "is the use of a book,' thought Alice 'without pictures or conversation?'";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a string to search for: ");
        String userInput = input.nextLine();

        boolean textContainsSearchTerm = aliceText.toLowerCase().contains(userInput.toLowerCase());

        if (textContainsSearchTerm) {
            int searchTermIndex = aliceText.toLowerCase().indexOf(userInput.toLowerCase());

            System.out.println("Your text was found starting at character: " + searchTermIndex + ".\n" +
                    "The length of your search term was: " + userInput.length());

            aliceText = aliceText.substring(0, searchTermIndex) +
                    aliceText.substring(searchTermIndex + userInput.length());
        } else {
            System.out.println("Your search term was not found.");
        }


        System.out.println("Text now reads:\n" + aliceText);
        input.close();

    }
}
