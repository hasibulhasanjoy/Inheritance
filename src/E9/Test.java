package E9;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("Jhon",1000);
        m.setDepartment("IT");
        String s = m.toString();
        System.out.println(s);
        Executive e = new Executive("Franklin",500);
        s = e.toString();
        System.out.println(s);
    }
}
