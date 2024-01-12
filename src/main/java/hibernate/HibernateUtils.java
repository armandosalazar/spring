package hibernate;

import org.hibernate.SessionFactory;

public class HibernateUtils {
    public static SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate.model.Client.class)
                .buildSessionFactory();
    }
}
