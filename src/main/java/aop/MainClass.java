package aop;

import aop.dao.ClientDaoAspects;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ClientDaoAspects clientDaoAspects = context.getBean("clientDaoAspects", ClientDaoAspects.class);
        clientDaoAspects.addClient();

        context.close();
    }
}
