package com.code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class EditCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			// transaction object
			session.beginTransaction();
			// first pass the id 
			// then get record with that id 
			// update teh value 
			// save the object 
			int id = 1;
			Category objcat = (Category) session.get(Category.class, id);
			if (objcat == null) {
				System.out.println("Sorry, not found");
			} else {
				System.out.println("found");
				// update the value 
				objcat.setName("Edit Test");
				// saveOrUpdate creates a new recored if id(pk) is null
				// otherwise, it creates a new record
				session.saveOrUpdate(args);
			}
			
			session.getTransaction().commit(); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
