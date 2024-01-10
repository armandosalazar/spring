package annotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport implements FinancialReportCreation {
    @Override
    public String getFinancialReport() {
        return "This is the financial report";
    }
}
