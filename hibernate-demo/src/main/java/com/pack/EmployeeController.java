package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeController {

	public static void main(String[] args) {

		
		Configuration config=new Configuration();
		config=config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
//		All operations goes inside
		//id is primary key so truncate the table first
		Employee emp=new Employee(107, "Aman", 10000d, 9891062743l, "amantiwari8861@gmail.com", 22, "Delhi");
		session.save(emp);
		Employee emp2=new Employee(108, "Aman", 10000d, 9891062743l, "amantiwari8861@gmail.com", 22, "Delhi");
		session.save(emp2);
		Employee emp1=new Employee(110, "kamal", 10200d, 98121062743l, "kamalsingh8861@gmail.com", 12, "london");
		session.save(emp1);
		Employee employee = session.get(Employee.class, 108);
		session.delete(employee);	
		
		transaction.commit();
		session.close();
	}

}