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
		//All operations goes inside
//		Employee emp=new Employee(102, "Aman", 10000d, 9891062743l, "amantiwari8861@gmail.com", 22, "Delhi");
//		session.save(emp);
//		Employee emp1=new Employee(105, "kamal", 10200d, 98121062743l, "kamalsingh8861@gmail.com", 12, "london");
//		session.delete(emp1);	
		
		transaction.commit();
		session.close();
	}

}