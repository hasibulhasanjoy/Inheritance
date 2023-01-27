import java.io.File;
import java.util.Scanner;

public class FileJava {
    public static void main(String[] args) throws Exception{
        File f = new File("BankDemo.java");
        Scanner in = new Scanner(f);
        String s = "";
        while(in.hasNextLine()){
            s = in.nextLine();
        }
        System.out.println(s);
    }
}
