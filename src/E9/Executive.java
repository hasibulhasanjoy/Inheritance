package E9;

public class Executive extends Manager{
    public Executive(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return  "Name : " + super.getName() + "\nsalary : " + super.getSalary();
    }
}
