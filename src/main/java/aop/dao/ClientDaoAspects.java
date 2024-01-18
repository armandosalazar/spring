package aop.dao;

import aop.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientDaoAspects {
    public void addClient(Client client, String type) {
        System.out.println("ClientDaoAspects.addClient()");
    }
}
