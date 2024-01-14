package hibernate;

import hibernate.model.Client;
import hibernate.model.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOneClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        Client client = new Client("John", "Smith", "New York");
        ClientDetails clientDetails = new ClientDetails("www.johnsmith.com", "123456789", "no comments");
        client.setClientDetails(clientDetails);

        session.beginTransaction();
        session.persist(client);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
