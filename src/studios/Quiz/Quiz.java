package studios.Quiz;

    import studios.Quiz.Question;
    import studios.Quiz.TrueFalse;
    import studios.Quiz.MultipleChoice;

    import java.sql.Array;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();

        TrueFalse q1 = new TrueFalse(
                "True or false: LOTR is better than Star Wars.",
                scanner,
                true);
        MultipleChoice q2 = new MultipleChoice(
                "What is the best dessert?",
                scanner,
                new String[] {"Ice cream", "Cake", "Churros"},
                "Churros");
        MultipleChoice q3 = new MultipleChoice(
                "Guess how many snakes there are?",
                scanner,
                new String[] {"4", "1", "13", "6", "15", "2"},
                "13");


        String[] q4Choices = {
                "Friends",
                "The Bachelor",
                "The Great British Baking Show",
                "Housewives of Beverley Hills",
                "American Ninja Warrior",
                "What We Do In The Shadows"};
        String[] q4Answers = {
                "What We Do In The Shadows",
                "The Great British Baking Show"};
        Checkbox q4 = new Checkbox("Select the good TV shows.", scanner, q4Choices, q4Answers);

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);

        int correctQuestions = 0;
        int totalQuestions = questions.size();

        for (Question question : questions) {
            if (question.tryAnswer()) {
                System.out.println("Good job!\n");
                correctQuestions++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        int percentageScore = (correctQuestions * 100) / totalQuestions;

        System.out.println("You scored: " + correctQuestions + "/" + totalQuestions + " (" + percentageScore + "%)");

    }

}
