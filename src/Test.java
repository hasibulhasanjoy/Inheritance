import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> st = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.next();
            st.add(s);
            if(s=="\n")
                break;
        }
        System.out.println(st);
    }
}
