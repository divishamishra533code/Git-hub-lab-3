package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;

        Session session = factory.openSession();
        session.beginTransaction();

        session.save(new Product("Laptop", "Electronics", 55000, 10));
        session.save(new Product("Mouse", "Electronics", 500, 50));
        session.save(new Product("Keyboard", "Electronics", 1500, 30));
        session.save(new Product("Chair", "Furniture", 3000, 15));
        session.save(new Product("Table", "Furniture", 7000, 5));
        session.save(new Product("Pen", "Stationery", 20, 100));
        session.save(new Product("Notebook", "Stationery", 100, 60));

        session.getTransaction().commit();
    }
}