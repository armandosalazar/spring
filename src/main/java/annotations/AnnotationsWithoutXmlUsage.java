package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsWithoutXmlUsage {

    public static void main(String[] args) {
        // Load xml configuration
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-annotations.xml");

        // Load java configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        // Get bean from context (container)
        Employee employee = context.getBean("employeeExperiencedMarketer", Employee.class);

        // Use bean
        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        // Close context (container)
        context.close();
    }
}
