package com.hibernatePractice;

import com.hibernatePractice.model.Contact;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class Main {
    //Hold a reusable reference to a SessionFactory
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static  SessionFactory buildSessionFactory(){
        // Create s standard service registry
        final ServiceRegistry registry;
        registry =  new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }
    public static void main(String[] args) {
        Contact contact = new Contact.ContactBuilder("Shahin","Beg")
                .withEmail("shahin@gmail.com")
                .withPhone("01315270225")
                .build();
        save(contact);
        fetchAllContact().stream().forEach(System.out::println);
    }
    private static void save(Contact contact){
        //Open a session
        Session session = sessionFactory.openSession();
        //Begin a transaction
        session.beginTransaction();
        //Use the session to save the contact
        session.persist(contact);
        //Commit the transaction
        session.getTransaction().commit();
        //Close the session
        session.close();
    }
    @SuppressWarnings("unchecked")
    private  static List<Contact> fetchAllContact(){
        //Open a session
        Session session = sessionFactory.openSession();

        // create Criteria
        CriteriaQuery<Contact> criteriaQuery = session.getCriteriaBuilder().createQuery(Contact.class);
        criteriaQuery.from(Contact.class);

        List<Contact> contacts = session.createQuery(criteriaQuery).getResultList();
        session.close();

        return contacts;
    }
}