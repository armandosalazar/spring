package hibernate;

import hibernate.model.Client;
import hibernate.model.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 1;
        session.beginTransaction();
        ClientDetails clientDetails = session.get(ClientDetails.class, id);
        session.getTransaction().commit();
        System.out.println(clientDetails);
        System.out.println(clientDetails.getClient());

        sessionFactory.close();
    }
}
