package hibernate;

import hibernate.model.Client;
import hibernate.model.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsertClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Client client = new Client("John", "Smith", "New York");
        ClientDetails clientDetails = new ClientDetails("www.johnsmith.com", "123456789", "no comments");
        client.setClientDetails(clientDetails);

        session.beginTransaction();
        session.persist(client);
        session.getTransaction().commit();

        System.out.println(client);

        session.close();
        sessionFactory.close();

    }
}
