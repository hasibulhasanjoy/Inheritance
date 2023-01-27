import java.util.Scanner;

public class NumQuestion {
    public static void main(String[] args) {
        Question q = new NumericQuestion();
        q.setText("10.39 - 9 = ?");
        q.setAnswer("1.39");
        q.display();
        System.out.print("What is your Answer : ");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(q.checkAnswer(s));
    }
}
