package com.ty.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	UniqueAuthority ua=new UniqueAuthority();
    	ua.setAdhaarId(123);
    	ua.setAdhaarContact(1673632882l);
    	
    	Person p=new Person();
    	p.setId(101);
    	p.setpName("dboss");
    	p.setpContact(2453738983l);
    	p.setUiadi(ua);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(UniqueAuthority.class).addAnnotatedClass(Person.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	session.save(ua);
    	session.save(p);
    	transaction.commit();
    }
}
