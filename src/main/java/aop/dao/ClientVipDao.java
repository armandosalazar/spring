package aop.dao;


import aop.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientVipDao {
    public void addClientVip(Client client) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A VIP CLIENT");
    }

    public void existsClient() {
        System.out.println(getClass() + ": DOING MY DB WORK: CHECKING IF CLIENT EXISTS");
    }
}
