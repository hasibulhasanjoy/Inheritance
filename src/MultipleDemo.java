import java.util.Scanner;

public class MultipleDemo {
    public static void main(String[] args) {
        MultiChoiceQuestion m = new MultiChoiceQuestion();
        m.setText("Name?");
        m.addChoices("Hasibul",true);
        m.addChoices("Rakib",false);
        m.addChoices("hasan",true);
        m.addChoices("joy",true);
        m.display();
        m.see();
        Scanner in = new Scanner(System.in);
        System.out.println("Answer : ");
        String st = in.nextLine();
        System.out.println(m.checkAnswer(st));
    }
}
