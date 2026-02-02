package com.kodnest.secondhibernate;
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
        System.out.println("Enter customername, customeremail, customerphone, accountnumber, password, amount");
        Bankuser bank = new Bankuser(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
        
        //step1
        Configuration conf = new Configuration().configure("hibernate.cfg.xml");
        
        //step2
        SessionFactory factory = conf.buildSessionFactory();
        
        //step3
        Session session = factory.openSession();
        
        //step4
        Transaction transaction = session.beginTransaction();
        
        //step5
        session.persist(bank);
        
        //step6
        transaction.commit();
        
        //step7
        session.close();
        factory.close();
    }
}
