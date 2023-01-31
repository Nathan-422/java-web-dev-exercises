package studios.Quiz;

public abstract class Question {

    private final String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public abstract boolean tryAnswer();

    public abstract String getAnswers();
    @Override
    public abstract String toString();

}
