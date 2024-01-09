package IoC;

public class EmployeeSecretary implements Employee {
    @Override
    public String getTasks() {
        return "I'm secretary, I'm doing nothing";
    }
}
