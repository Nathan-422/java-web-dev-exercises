package studios.CharacterCount;

import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {


        // init variables
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] characters = text.toCharArray();
        Scanner scan = new Scanner(System.in);

        // init count objects
        ArrayList<Character> foundCharacters = new ArrayList<>();
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        System.out.println("Enter a line count (blank to use default text):");
        String input = scan.nextLine();

        if (!input.equals("")) {
            characters = input.toCharArray();
        }


        for (int i = 0; i < characters.length; i++) {

            Character c = Character.toLowerCase(characters[i]);

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

        Collections.sort(foundCharacters);

        for (Character c : foundCharacters) {

            System.out.println(c + ": " + characterCounts.get(c));

        }

    }

}
