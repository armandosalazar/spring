package aop;

import org.springframework.stereotype.Component;

@Component
public class ClientDAO {
    public void addClient() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A CLIENT");
    }
}
