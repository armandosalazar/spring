package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsUsage {

    public static void main(String[] args) {
        // Load xml configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-annotations.xml");

        // Get bean from context (container)
        Employee employee = context.getBean("employeeComercial", Employee.class);

        // Use bean
        System.out.println(employee.getTasks());

        // Close context (container)
        context.close();
    }
}
