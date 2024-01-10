package annotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportFinal implements FinancialReportCreation {
    @Override
    public String getFinancialReport() {
        return "Financial report final";
    }
}
