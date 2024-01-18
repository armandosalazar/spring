package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        // get the bean from spring container
        ClientDao clientDAO = context.getBean("clientDao", ClientDao.class);
        ClientVipDao clientVipDAO = context.getBean("clientVipDao", ClientVipDao.class);
        // call the business method
        clientDAO.addClient(new Client(), "admin"); // this will trigger the aspect
        clientVipDAO.addClientVip(new Client()); // this will trigger the aspect
        clientDAO.existsClient(); // this will trigger the aspect
        clientVipDAO.existsClient(); // this will trigger the aspect
        // close the context
        context.close();
    }
}
