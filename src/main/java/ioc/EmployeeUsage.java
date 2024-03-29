package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeUsage {

    public static void main(String[] args) {
//        Employee employeeBoss = new EmployeeBoss();
//        System.out.println(employeeBoss.getTasks());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        Employee employee = context.getBean("employee", Employee.class);
//        System.out.println(employee.getTasks());
//        System.out.println(employee.getReport());

        EmployeeSecretary employeeSecretary = context.getBean("employeeSecretary", EmployeeSecretary.class);
        System.out.println(employeeSecretary.getTasks());
        System.out.println(employeeSecretary.getReport());
        System.out.println(employeeSecretary.getCompanyName());
        System.out.println("Email: ".concat(employeeSecretary.getEmail()));

        context.close();

    }
}
