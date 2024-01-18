package aop;

import org.springframework.stereotype.Component;

@Component
public class ClientDao {
    public void addClient(Client client, String type) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A CLIENT");
    }

    public void existsClient() {
        System.out.println(getClass() + ": DOING MY DB WORK: CHECKING IF CLIENT EXISTS");
    }
}
