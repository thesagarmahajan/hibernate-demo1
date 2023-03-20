package com.specialization.hibernate.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetAndLoadMethodDemo {

	public GetAndLoadMethodDemo() {
		super();
		// TODO Auto-generated constructor stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		/* get() Example */
		
		// get() Method returns null if there is no object available in database
//		User fetchedUser = session.get(User.class, 2);
		// Hence below line will throw ____________Exception
//		System.out.println(fetchedUser.toString());
		
		
		/* load() Example */
		
		// load() Method throws ObjectNotFoundException
		// load() Methods returns proxy object and won't hit the database until the proxy object is not invoked
//		User fetchUser2 = session.load(User.class, 2);
		// Invoking proxy object
//		System.out.println(fetchUser2);
		
		session.close();
		factory.close();
	}
	
}
