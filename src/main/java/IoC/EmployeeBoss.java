package IoC;

public class EmployeeBoss implements Employee {
    private final ReportCreation reportCreation;

    // Dependency injection via constructor
    public EmployeeBoss(ReportCreation reportCreation) {
        this.reportCreation = reportCreation;
    }

    @Override
    public String getTasks() {
        return "I'm boss, I'm doing nothing";
    }

    @Override
    public String getReport() {
        return reportCreation.getReport().concat(" and I'm boss");
    }
}
