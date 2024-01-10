package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsWithBeanAnnotationUsage {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        EmployeeDirector employee = context.getBean("employeeDirector", EmployeeDirector.class);

        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());
        System.out.println(employee.getEmail());

        context.close();
    }
}
