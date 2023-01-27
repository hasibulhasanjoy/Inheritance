import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question question = new Question();
        question.setText("Who is the inventor of Java?");
        question.setAnswer("James Gosling");
        question.display();
        System.out.println("Your answer");
        String response = in.nextLine();
        System.out.println(question.checkAnswer(response));
        in.close();
    }

}
