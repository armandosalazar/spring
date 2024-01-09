package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatternsUsage {

    public static void main(String[] args) {

        // Load the Spring context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context-patterns.xml"
        );

        // Retrieve the bean from the Spring context (container)
        EmployeeSecretary employeeSecretary = context.getBean("employeeSecretary", EmployeeSecretary.class);
        EmployeeSecretary employeeSecretary2 = context.getBean("employeeSecretary", EmployeeSecretary.class);

        System.out.println("employeeSecretary == employeeSecretary2: " + (employeeSecretary == employeeSecretary2));
        System.out.println("employeeSecretary: " + employeeSecretary);
        System.out.println("employeeSecretary2: " + employeeSecretary2);

        // Close the context (container)
        context.close();


    }
}
