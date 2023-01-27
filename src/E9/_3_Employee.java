package E9;

public class _3_Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public _3_Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "Name : " + getName() + "\nsalary : " + getSalary() + "\nDepartment : " ;
    }
}
