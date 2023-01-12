package studios.CharacterCount;

import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {

        // init variables
        String text = loadText();
        char[] characters = text.toCharArray();
        Scanner scan = new Scanner(System.in);

        // init count objects
        ArrayList<Character> foundCharacters = new ArrayList<>();
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // ask for a user supplied line
        System.out.println("Enter a line count (blank to use default text):");
        String input = scan.nextLine();

        if (!input.equals("")) {
            characters = input.toCharArray();
        }


        for (int i = 0; i < characters.length; i++) {

            Character c = Character.toLowerCase(characters[i]);

            // TODO filter to alphabetic characters only
            if (c.equals(' ') || c.equals(',') || c.equals('.') || c.equals('’')) {
                continue;
            }

            // init list of characters and count
            if (!foundCharacters.contains(c)) {
                foundCharacters.add(c);
                characterCounts.put(c, 0);
            }

            // count found characters
            characterCounts.put(c, characterCounts.get(c) + 1);

        }

        // sort characters before printing
        Collections.sort(foundCharacters);

        // print counts of characters
        for (Character c : foundCharacters) {
            System.out.println(c + ": " + characterCounts.get(c));
        }

    }

    private static String loadText() {

        final String FILE = "src/studios/CharacterCount/HiddenFigures.txt";
        String text = "Error";

        try {
            Reader in = new FileReader(FILE);
            Scanner scanner = new Scanner(in);

            // get text from the file
            text = scanner.nextLine();
            // this works because the file is only one line long.
            // more lines and we'd need a loop.
        } catch (Exception e) {
            System.out.println("Failed to load files :(");
            e.printStackTrace();
        }
        return text;
    }

}
