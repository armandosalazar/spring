package hibernate;

import org.hibernate.SessionFactory;

public class HibernateUtil {
    public static SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate.entity.Client.class)
                .addAnnotatedClass(hibernate.entity.ClientDetails.class)
                .addAnnotatedClass(hibernate.entity.Order.class)
                .buildSessionFactory();
    }
}
