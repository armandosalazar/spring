package hibernate;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSaveClient {

    public static void main(String[] args) {
        // create session factory
        // SessionFactory factory = HibernateUtils.getSessionFactory();
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate.model.Client.class)
                .buildSessionFactory();

        // create session
        Session session = factory.openSession();
        try {
            Client client = new Client("John", "Doe", "123 Main Street");

            // start a transaction
            session.beginTransaction();
            // save the student object
            session.persist(client);

            Client clientInserted = session.get(Client.class, client.getId());
            System.out.println("[*] " + clientInserted.toString());

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
            session.close();
        } finally {
            factory.close();
        }
    }
}
