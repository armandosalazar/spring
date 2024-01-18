package aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClientDaoAspects {
    public void addClient() {
        System.out.println("ClientDaoAspects.addClient()");
    }
}
