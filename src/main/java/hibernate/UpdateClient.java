package hibernate;

import hibernate.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateClient {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        int id = 2;
        Client client = session.get(Client.class, id); // select * from client where id = 5
        System.out.println(client);

        client.setFirstName("Luis");
        client.setLastName("Garcia");
        client.setAddress("Sinaloa #468");
        // session.save(client); // insert
        // session.merge(client); // update: you can update simply with the setters without using merge
        session
                .createMutationQuery("update Client cl set cl.lastName = 'García' where cl.lastName like 'G%'") // update
                .executeUpdate(); // execute the update query

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}
