package com.specialization.hibernate.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.specialization.hibernate.pojos.Employee;
import com.specialization.hibernate.pojos.Machine;

public class OneToOneMappingDemo {

	public OneToOneMappingDemo() {
		super();
		// TODO Auto-generated constructor stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee1 = new Employee();
		Machine machine1  = new Machine();
		
		Employee employee2 = new Employee();
		Machine machine2 = new Machine();
		
		machine1.setSr_number("ABC123");
		machine1.setType("Windows Machine");
		machine1.setEmployee(employee1);
		
		machine2.setSr_number("XYZ789");
		machine2.setType("Mac Mini");
		machine2.setEmployee(employee2);
		
		employee1.setNameString("Employee 1");
		employee1.setMachine(machine1);
		
		employee2.setNameString("Employee 2");
		employee2.setMachine(machine2);
		
		session.save(machine1);
		session.save(machine2);
		session.save(employee1);
		session.save(employee2);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
	
}
