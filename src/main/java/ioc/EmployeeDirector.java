package ioc;

public class EmployeeDirector implements Employee {
    private final ReportCreation reportCreation;

    public EmployeeDirector(ReportCreation reportCreation) {
        this.reportCreation = reportCreation;
    }

    @Override
    public String getTasks() {
        return "I'm director, I'm doing nothing";
    }

    @Override
    public String getReport() {
        return reportCreation.getReport().concat(" and I'm director");
    }
}
