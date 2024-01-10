package annotations;

import org.springframework.beans.factory.annotation.Value;

public class EmployeeDirector implements Employee {
    private final FinancialReportCreation financialReportCreation;
    @Value("${email}")
    private String email;

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

    public String getEmail() {
        return email;
    }
}
