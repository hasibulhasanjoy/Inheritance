package E9;

public class Manager extends _3_Employee{
    private String department;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return "Name : " + super.getName() + "\nsalary : " + super.getSalary() + "\nDepartment : "  + getDepartment();
    }
}
