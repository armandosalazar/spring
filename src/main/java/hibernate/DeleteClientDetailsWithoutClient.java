package hibernate;

import hibernate.model.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Optional;

public class DeleteClientDetailsWithoutClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 2;
        session.beginTransaction();
        Optional<ClientDetails> clientDetails = Optional.ofNullable(session.get(ClientDetails.class, id));
        if (clientDetails.isPresent()) {
            clientDetails.get().getClient().setClientDetails(null);
            session.remove(clientDetails.get());
        } else System.out.println("Client with id " + id + " not found");

        session.getTransaction().commit();
        System.out.println(clientDetails);

        session.close();
        sessionFactory.close();
    }
}
