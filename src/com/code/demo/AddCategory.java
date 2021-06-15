package com.code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class AddCategory {

	public static void main(String[] args) {
		// create session factory 
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// transaction object 
			session.beginTransaction();
			Category catobj = new Category(1,  "test"); 
			session.save(catobj); 
			session.getTransaction().commit();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
