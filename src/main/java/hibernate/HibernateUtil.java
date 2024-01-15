package hibernate;

import org.hibernate.SessionFactory;

public class HibernateUtil {
    public static SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate.model.Client.class)
                .addAnnotatedClass(hibernate.model.ClientDetails.class)
                .addAnnotatedClass(hibernate.model.Order.class)
                .buildSessionFactory();
    }
}
