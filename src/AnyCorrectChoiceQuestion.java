import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question {
    ArrayList<String> answer;
    private ArrayList<String> choices;

    public AnyCorrectChoiceQuestion() {
        answer = new ArrayList<>();
        choices = new ArrayList<>();
    }

    public void addChoices(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            answer.add(choice);
        }
    }

    @Override
    public void display() {
        super.display();
        int i = 1;
        for (String e : choices) {
            System.out.println(i + " :" + e);
            i++;
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        for (String s : answer) {
            if (s.equals(response)) {
                return true;
            }
        }
        return false;
    }
}
