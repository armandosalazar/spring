package hibernate;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClientQueriesHql {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        String query = "from Client";
        session.createQuery(query, hibernate.model.Client.class)
                .getResultList()
                .forEach(System.out::println);

        List<Client> clients = session
                .createQuery("from Client cl where cl.id = 1 or cl.firstName = 'Luis'", Client.class)
                .getResultList();
        clients.forEach(System.out::println);

        session.createSelectionQuery("select cl from Client cl where cl.id = 1 or cl.firstName = 'Luis'", Client.class)
                .getResultList()
                .forEach(System.out::println);

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
