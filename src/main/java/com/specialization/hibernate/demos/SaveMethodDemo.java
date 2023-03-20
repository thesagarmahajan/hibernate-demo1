package com.specialization.hibernate.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.specialization.hibernate.pojos.User;

public class SaveMethodDemo {

	public SaveMethodDemo() {
		super();
		// TODO Auto-generated constructor stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User userToSave = new User();
		userToSave.setName("Sagar Mahajan");
		userToSave.setEmail("sagar.mahajan@citiustech.com");
		userToSave.setPassword("123123");
		
		System.out.println("Saving User....");
		session.save(userToSave);
		System.out.println("User Saved!!!");
		
		transaction.commit();
		
		session.close();
		factory.close();
	}
	
}
