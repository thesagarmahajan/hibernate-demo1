package com.specialization.hibernate.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.specialization.hibernate.pojos.Location;
import com.specialization.hibernate.pojos.User;

public class EmbeddableDemo {

	public EmbeddableDemo() {
		super();
		// TODO Auto-generated constructor stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user1 = new User();
		User user2 = new User();
		
		Location location1 = new Location();
		Location location2 = new Location();
		
		location1.setCity("Navi Mumbai");
		location1.setState("Maharashtra");
		location1.setPin("410206");
		location1.setCountry("India");
		
		user1.setName("User From NM");
		user1.setEmail("user.from.nm@citiustech.com");
		user1.setPassword("123456");
		user1.setLcation(location1);
		
		location2.setCity("Lucknow");
		location2.setState("Uttar Pradesh");
		location2.setPin("226001");
		location2.setCountry("India");
		
		user2.setName("User From LN");
		user2.setEmail("user.from.ln@citiustech.com");
		user2.setPassword("654321");
		user2.setLcation(location2);
		
		
		session.save(user1);
		session.save(user2);
		
		transaction.commit();
		session.close();
		factory.close();
	}
	
}
