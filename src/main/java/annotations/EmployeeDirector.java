package annotations;

public class EmployeeDirector implements Employee {
    private final FinancialReportCreation financialReportCreation;

    public EmployeeDirector(FinancialReportCreation financialReportCreation) {
        this.financialReportCreation = financialReportCreation;
    }

    @Override
    public String getTasks() {
        return "Manage the company";
    }

    @Override
    public String getReport() {
        return "Report of the company: ".concat(financialReportCreation.getFinancialReport());
    }
}
