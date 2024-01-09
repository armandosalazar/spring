package IoC;

public class EmployeeUsage {

    public static void main(String[] args) {
        Employee employeeBoss = new EmployeeBoss();
        System.out.println(employeeBoss.getTasks());
    }
}
