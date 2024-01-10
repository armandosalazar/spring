package annotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportExt implements FinancialReportCreation {
    @Override
    public String getFinancialReport() {
        return "Financial report extended";
    }
}
