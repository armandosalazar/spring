package mvc.dao;

import jakarta.transaction.Transactional;
import mvc.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a specialized @Component annotation which is used to indicate that the class provides the mechanism for
// storage, retrieval, search, update and delete operation on objects.
@Repository
public class ClientDaoImpl implements ClientDao {
    private final SessionFactory sessionFactory;

    public ClientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // use @Transactional to begin and end transaction automatically
    @Override
    public @Transactional List<Client> findAll() {
        // get the current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // create a query
        return session.createQuery("from Client", Client.class).getResultList();
    }

    @Override
    public @Transactional Client findById(int id) {
        // get the current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // get the customer
        return session.get(Client.class, id);
    }

    @Override
    @Transactional
    public void save(Client client) {
        // get the current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // save the customer
        session.persist(client);
    }

    @Override
    public @Transactional void update(Client client) {
        // get the current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // update the customer
        session.merge(client);
        System.out.println("[*] Update client: " + client);
    }
}
