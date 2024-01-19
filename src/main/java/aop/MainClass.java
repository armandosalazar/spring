package aop;

import aop.dao.ClientDaoAspects;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ClientDaoAspects clientDaoAspects = context.getBean("clientDaoAspects", ClientDaoAspects.class);
        // Client client = new Client();
        // client.setFullName("Armando Salazar");
        // client.setType("VIP");
        // clientDaoAspects.addClient(client, client.getType());
        try {
            System.out.println("MainClass.main(): " + clientDaoAspects.getClients(true));
        } catch (Exception e) {
            System.out.println("MainClass.main(): " + e.getMessage());
        }

        context.close();
    }
}
