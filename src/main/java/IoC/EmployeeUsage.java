package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeUsage {

    public static void main(String[] args) {
//        Employee employeeBoss = new EmployeeBoss();
//        System.out.println(employeeBoss.getTasks());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getTasks());

        context.close();

    }
}
