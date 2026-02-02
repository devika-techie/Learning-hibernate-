package com.kodnest.firsthibernate1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, gender and salary");
        Employee emp = new Employee(sc.next(), sc.next(), sc.nextInt());
        // hibernate steps
        Configuration conf = new Configuration().configure("hibernate.cfg.xml");
        
        // step 2
        
        SessionFactory factory = conf.buildSessionFactory();
         
        // step 3
        
        Session session = factory.openSession();
        
        // step 4
        
       Transaction transaction = session.beginTransaction();
        
        // step 5
        
        session.persist(emp);
        
        //step6
        
        transaction.commit();
        
        //step 7
        
        session.close();
        factory.close();
          
    }
}
