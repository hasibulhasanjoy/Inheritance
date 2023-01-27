import java.util.ArrayList;

/**
 * ChoiceQuestion
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    public ChoiceQuestion() {
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            String choiceString = "" + choices.size();
            this.setAnswer(choiceString);
        }
    }

    public void display() {
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ":" + choices.get(i));
        }
    }

}
