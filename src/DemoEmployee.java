public class DemoEmployee {
    public static void main(String[] args) {
        Employee m = new Manager("Jhon",20000,1000);
        System.out.println("Name :" + m.getName() + " Total Salary : " + m.getSalary());
    }
}
