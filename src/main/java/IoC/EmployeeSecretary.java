package IoC;

public class EmployeeSecretary implements Employee {
    private ReportCreation reportCreation;

    public void setReportCreation(ReportCreation reportCreation) {
        this.reportCreation = reportCreation;
    }

    @Override
    public String getTasks() {
        return "I'm secretary, I'm doing nothing";
    }

    @Override
    public String getReport() {
        return reportCreation.getReport().concat(" and I'm secretary");
    }


}
