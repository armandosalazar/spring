package IoC;

public class EmployeeBoss implements Employee {
    @Override
    public String getTasks() {
        return "I'm boss, I'm doing nothing";
    }
}
