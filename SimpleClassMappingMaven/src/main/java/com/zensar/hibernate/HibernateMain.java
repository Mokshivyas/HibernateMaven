package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class HibernateMain
{
    public static void main( String[] args )
    {
       Configuration c = new Configuration().configure();
       SessionFactory f = c.buildSessionFactory();
       Session s = f.openSession();
       Transaction t = s.beginTransaction();
       
       Product p = new Product();
       p.setProductId(1007);
       p.setName("Earphones");
       p.setBrand("JBL");
       p.setPrice(5000);
       s.save(p);
       
       t.commit();
     s.close();
    }
}
