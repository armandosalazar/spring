package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MeasurementService measurementService = context.getBean("measurementService", MeasurementService.class);
        System.out.println("MainClass.main(): " + measurementService.getClass().getName());
        String measurement = measurementService.getMeasurement();
        System.out.println("MainClass.main(): " + measurement);

        // ClientDaoAspects clientDaoAspects = context.getBean("clientDaoAspects", ClientDaoAspects.class);
        // Client client = new Client();
        // client.setFullName("Armando Salazar");
        // client.setType("VIP");
        // clientDaoAspects.addClient(client, client.getType());
        // try {
        //     System.out.println("MainClass.main(): " + clientDaoAspects.getClients(false));
        // } catch (Exception e) {
        //     System.out.println("MainClass.main(): " + e.getMessage());
        // }

        context.close();
    }
}
