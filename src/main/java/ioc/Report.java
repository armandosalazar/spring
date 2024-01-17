package ioc;

public class Report implements ReportCreation {
    @Override
    public String getReport() {
        return "This is a report";
    }
}
