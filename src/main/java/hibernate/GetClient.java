package hibernate;

import hibernate.model.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 1;
        try {
            session.beginTransaction();
            ClientDetails clientDetails = session.get(ClientDetails.class, id);
            session.remove(clientDetails);
            session.getTransaction().commit();

            System.out.println(clientDetails);
            System.out.println(clientDetails.getClient());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            // session.getTransaction().rollback();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
