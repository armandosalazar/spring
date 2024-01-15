package hibernate;

import hibernate.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOneDeleteClientInCascade {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 2;
        session.beginTransaction();
        Client client = session.get(Client.class, id);
        if (client != null) {
            session.remove(client);
        } else System.out.println("Client with id " + id + " not found");
        session.getTransaction().commit();
        System.out.println(client);

        session.close();
        sessionFactory.close();
    }
}
