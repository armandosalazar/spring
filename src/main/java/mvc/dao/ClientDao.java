package mvc.dao;

import mvc.entity.Client;

import java.util.List;

public interface ClientDao {
    List<Client> findAll();

    Client findById(int id);

    void save(Client client);

    void update(Client client);

    void delete(int id);

}
