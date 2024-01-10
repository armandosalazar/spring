package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeExperiencedMarketer implements Employee {
    private FinancialReportCreation financialReportCreation;

    // Constructor injection
    // @Autowired: Spring will automatically look for a bean that implements FinancialReportCreation and inject it here
//    @Autowired
//    public EmployeeExperiencedMarketer(FinancialReportCreation financialReportCreation) {
//        this.financialReportCreation = financialReportCreation;
//    }

    // Setter injection
    @Autowired
    public void setFinancialReportCreation(FinancialReportCreation financialReportCreation) {
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
