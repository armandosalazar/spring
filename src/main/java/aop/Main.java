package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        // get the bean from spring container
        ClientDAO clientDAO = context.getBean("clientDAO", ClientDAO.class);
        // call the business method
        clientDAO.addClient();
        // close the context
        context.close();
    }
}
