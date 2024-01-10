package annotations;

import org.springframework.stereotype.Component;

@Component
public class EmployeeComercial implements Employee {
    @Override
    public String getTasks() {
        return "I'm selling!";
    }

    @Override
    public String getReport() {
        return "I sold everything!";
    }
}
