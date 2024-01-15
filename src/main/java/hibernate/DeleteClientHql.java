package hibernate;

import hibernate.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteClientHql {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 6;
        session.beginTransaction();
        Client client = session.get(Client.class, id);

        session.remove(client);
        session
                .createMutationQuery("delete from Client cl where cl.id = 5")
                .executeUpdate();

        session.getTransaction().commit();

        System.out.println(client);

        session.close();
        sessionFactory.close();
    }
}
