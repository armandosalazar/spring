package aop.dao;

import aop.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientDaoAspects {
    public void addClient(Client client, String type) {
        System.out.println("ClientDaoAspects.addClient()");
    }

    public List<Client> getClients(boolean throwException) {
        if (throwException) throw new RuntimeException("Error when getting customers, check your connection to the database");

        System.out.println("ClientDaoAspects.getClients()");
        return List.of(
                new Client("Armando Salazar", "VIP"),
                new Client("Jack Sparrow", "Regular"),
                new Client("Hector Díaz", "Regular")
        );
    }
}
