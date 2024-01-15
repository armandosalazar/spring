package hibernate;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetOrdersClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int idClient = 3;
        session.beginTransaction();
        Client client = session.get(Client.class, idClient);
        session.getTransaction().commit();

        client.getOrders().forEach(System.out::println);

        sessionFactory.close();
    }
}
