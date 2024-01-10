package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsWithBeanAnnotationUsage {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        Employee employee = context.getBean("employeeDirector", Employee.class);

        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        context.close();
    }
}
