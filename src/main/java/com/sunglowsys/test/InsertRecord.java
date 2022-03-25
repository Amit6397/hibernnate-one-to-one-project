package com.sunglowsys.test;

import com.sunglowsys.domain.AddressCrud;
import com.sunglowsys.domain.Student;
//import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println("started");
        Student student = new Student();
        student.setName("amit");

        AddressCrud address = new AddressCrud("kasganj");

        student.setAddress(address);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        session.save(student);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }



}
