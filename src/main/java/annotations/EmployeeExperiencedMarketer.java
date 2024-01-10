package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeExperiencedMarketer implements Employee {
    private final FinancialReportCreation financialReportCreation;

    // @Autowired: Spring will automatically look for a bean that implements FinancialReportCreation and inject it here
    @Autowired
    public EmployeeExperiencedMarketer(FinancialReportCreation financialReportCreation) {
        this.financialReportCreation = financialReportCreation;
    }

    @Override
    public String getTasks() {
        return "I'm selling!";
    }

    @Override
    public String getReport() {
        return financialReportCreation.getFinancialReport();
    }
}
