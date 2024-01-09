package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleUsage {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-lifecycle.xml");

        Employee employee = context.getBean("employeeBoss", Employee.class);
        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        context.close();
    }
}
