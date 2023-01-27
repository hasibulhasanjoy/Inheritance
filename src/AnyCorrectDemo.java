import java.util.Scanner;

public class AnyCorrectDemo {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();
        q.setText("Name of the University?");
        q.addChoices("Rajshahi University",true);
        q.addChoices("Dhaka University",false);
        q.addChoices("RU",true);
        q.addChoices("Du",false);
        q.display();
        Scanner in = new Scanner(System.in);
        System.out.println("Your answer?");
        String ans = in.nextLine();
        System.out.println(q.checkAnswer(ans));
    }
}
