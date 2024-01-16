package mvc.dao;

import jakarta.transaction.Transactional;
import mvc.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {
    private final SessionFactory sessionFactory;

    public ClientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public @Transactional List<Client> getClients() {
        // get the current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // create a query
        return session.createQuery("from Client", Client.class).getResultList();
    }
}
