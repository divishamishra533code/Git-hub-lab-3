package org.example;

import org.hibernate.Session;

public class MainApp {
    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();

        Product p = session.get(Product.class, 1);

        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());

        session.close();
    }
}