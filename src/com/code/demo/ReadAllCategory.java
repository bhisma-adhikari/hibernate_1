package com.code.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class ReadAllCategory {

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
			// read all data from table 
			// from <Class_name> , not table name 
			List<Category> lstcategory = session.createQuery("from Category").getResultList();
			if (lstcategory.size() == 0) {
				System.out.println("No record found");
			} else {
				System.out.println(lstcategory.size() + " records found");
				for (Category c : lstcategory) {
					System.out.println(c);
				}
			}
			session.getTransaction().commit();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
