package IoC;

public class EmployeeDirector implements Employee {
    @Override
    public String getTasks() {
        return "I'm director, I'm doing nothing";
    }
}
