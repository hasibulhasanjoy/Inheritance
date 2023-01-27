import java.util.ArrayList;

public class MultiChoiceQuestion extends Question{
    ArrayList<String> choices;
    String s;

    public MultiChoiceQuestion() {
        choices = new ArrayList<>();
        s = "";
    }
    public void addChoices(String answer,boolean correct) {
        choices.add(answer);
        if (correct) {
            s+=answer+" ";
        }
    }

    @Override
    public void display() {
        super.display();
        int i = 1;
        for(String e:choices){
            System.out.println(i + ": "+e);
        }
    }
public void see(){
    System.out.println(s);
}
    @Override
    public boolean checkAnswer(String response) {
//        System.out.println();
        return s.trim().equals(response);
    }
}
