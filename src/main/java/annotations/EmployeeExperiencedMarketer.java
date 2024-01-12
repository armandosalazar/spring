package annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype") // Every time we call getBean() we will get a new instance of this class
// For prototype scope, Spring will not call @PostConstruct and @PreDestroy
// For singleton scope, Spring will call @PostConstruct and @PreDestroy only once
public class EmployeeExperiencedMarketer implements Employee {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Executed after constructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Executed before bean is destroyed");
    }

    // Constructor injection
    // @Autowired: Spring will automatically look for a bean that implements FinancialReportCreation and inject it here
//    @Autowired
//    public EmployeeExperiencedMarketer(FinancialReportCreation financialReportCreation) {
//        this.financialReportCreation = financialReportCreation;
//    }

    // Setter injection
//    @Autowired
//    public void setFinancialReportCreation(FinancialReportCreation financialReportCreation) {
//        this.financialReportCreation = financialReportCreation;
//    }

    // Field injection
    @Autowired
    @Qualifier("financialReportExt")
    // Spring will look for a bean with the name "financialReportExt" and inject it here
    private FinancialReportCreation financialReportCreation;

    @Override
    public String getTasks() {
        return "I'm selling!";
    }

    @Override
    public String getReport() {
        return financialReportCreation.getFinancialReport();
    }
}
