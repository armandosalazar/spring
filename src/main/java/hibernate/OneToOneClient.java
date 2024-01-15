package hibernate;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOneClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Client client = new Client("John", "Smith", "New York");
        // ClientDetails clientDetails = new ClientDetails("www.johnsmith.com", "123456789", "no comments");
        // client.setClientDetails(clientDetails);

        int id = 2;
        session.beginTransaction();
        Client client = session.get(Client.class, id);
        if (client != null) {
            session.remove(client);
        } else System.out.println("Client with id " + id + " not found");
        // session.persist(client);
        session.getTransaction().commit();
        System.out.println(client);

        session.close();
        sessionFactory.close();
    }
}
