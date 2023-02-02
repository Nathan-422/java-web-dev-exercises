package studios.Quiz.test;

import org.junit.Test;
import studios.Quiz.main.Checkbox;
import studios.Quiz.main.MultipleChoice;
import studios.Quiz.main.Question;

import org.junit.Before;
import studios.Quiz.main.TrueFalse;

import java.util.Scanner;

import static org.junit.Assert.*;
public class QuestionTest {

    private TrueFalse tf;
    private MultipleChoice mc;
    private Checkbox ch;
    Scanner scanner = new Scanner(System.in);

    @Before
    public void createQuestions() {
        tf = new TrueFalse("Answer is true.", scanner, true);

        mc = new MultipleChoice(
                "What is the best dessert?",
                scanner,
                new String[] {"Ice cream", "Cake", "Churros"},
                "Churros");

        String[] chChoices = {
                "Friends",
                "The Bachelor",
                "The Great British Baking Show",
                "Housewives of Beverley Hills",
                "American Ninja Warrior",
                "What We Do In The Shadows"};
        String[] chAnswers = {
                "What We Do In The Shadows",
                "The Great British Baking Show"};
        ch = new Checkbox("Select the good TV shows.", scanner, chChoices, chAnswers);
    }

    @Test
    public void trueFalseToStringReturnsGivenQuestion() {
        String spec = "toString method returns the original String passed in as an answer.";
        String expected = "Answer is true.";
        String actual = tf.toString();

        assertEquals(spec, expected, actual);

    }

    @Test
    public void multipleChoiceToStringReturnsGivenQuestion() {

        String spec = "toString of MultipleChoice returns the original question String";
        String expected = "What is the best dessert?";
        String actual = mc.toString();

        assertEquals(spec, expected, actual);

    }
    @Test
    public void checkboxToStringReturnsGivenQuestion() {

        String spec = "toString of Checkbox returns the original question String";
        String expected = "Select the good TV shows.";
        String actual = ch.toString();

        assertEquals(spec, expected, actual);

    }

}
