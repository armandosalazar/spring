package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsWithPatternsUsage {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations/applicationContext.xml");

        Employee employee = context.getBean("employeeExperiencedMarketer", Employee.class);
        Employee employee2 = context.getBean("employeeExperiencedMarketer", Employee.class);

        System.out.println(employee);
        System.out.println(employee2);

        context.close();

    }
}
