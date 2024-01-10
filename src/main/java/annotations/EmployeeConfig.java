package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotations")
public class EmployeeConfig {

    // Define your beans here
    @Bean
    public FinancialReportCreation financialReportFinal() {
        return new FinancialReportFinal();
    }

    @Bean
    public Employee employeeDirector() {
        return new EmployeeDirector(financialReportFinal());
    }
}
