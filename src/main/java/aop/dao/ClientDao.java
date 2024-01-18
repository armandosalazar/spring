package aop.dao;

import aop.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientDao {
    private String value;
    private String code;

    public void addClient(Client client, String type) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A CLIENT");
    }

    public void existsClient() {
        System.out.println(getClass() + ": DOING MY DB WORK: CHECKING IF CLIENT EXISTS");
    }

    public String getValue() {
        System.out.println("Get value of client");
        return value;
    }

    public void setValue(String value) {
        System.out.println("Set value of client");
        this.value = value;
    }

    public String getCode() {
        System.out.println("Get code of client");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Set code of client");
        this.code = code;
    }

}
