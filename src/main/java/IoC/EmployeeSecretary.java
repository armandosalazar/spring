package IoC;

public class EmployeeSecretary implements Employee {
    private ReportCreation reportCreation;
    private String companyName;
    private String email;

    public void setReportCreation(ReportCreation reportCreation) {
        this.reportCreation = reportCreation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTasks() {
        return "I'm secretary, I'm doing nothing";
    }

    @Override
    public String getReport() {
        return reportCreation.getReport().concat(" and I'm secretary");
    }


}
