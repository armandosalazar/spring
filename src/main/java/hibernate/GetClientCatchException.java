package hibernate;

import hibernate.entity.ClientDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetClientCatchException {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        int id = 1;
        try {
            session.beginTransaction();
            ClientDetails clientDetails = session.get(ClientDetails.class, id);
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
