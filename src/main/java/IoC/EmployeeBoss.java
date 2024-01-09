package IoC;

public class EmployeeBoss implements Employee {
    private final ReportCreation reportCreation;

    // Init method: called after constructor
    public void init() {
        System.out.println("[*] Tasks before bean is ready");
    }

    // Destroy method: called before closing context
    public void destroy() {
        System.out.println("[*] Tasks before bean is destroyed");
    }

    // Dependency injection via constructor
    public EmployeeBoss(ReportCreation reportCreation) {
        this.reportCreation = reportCreation;
    }

    @Override
    public String getTasks() {
        return "I'm boss, I'm doing nothing";
    }

    @Override
    public String getReport() {
        return reportCreation.getReport().concat(" and I'm boss");
    }
}
