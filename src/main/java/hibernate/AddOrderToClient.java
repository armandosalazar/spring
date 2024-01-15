package hibernate;

import hibernate.model.Client;
import hibernate.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;

public class AddOrderToClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 3;
        session.beginTransaction();
        // Get client with id 3
        Client client = session.get(Client.class, id);
        // Create new order
        Order order = new Order(new Date(System.currentTimeMillis()));
        // Add order to client
        client.addOrder(order);
        // Save order
        session.persist(order);

        session.getTransaction().commit();
        System.out.println(client);
        System.out.println(order);

        sessionFactory.close();
    }
}
