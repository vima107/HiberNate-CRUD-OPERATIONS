package com.qn.hib.one.one.hibernate_one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class DisplayData {
	public static void main(String[] args) {
	
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
									addAnnotatedClass(Student.class).
									addAnnotatedClass(Student_detail.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		session.beginTransaction();
		
		Student s=session.get(Student.class, 1);
		System.out.println(s);
		
		Student_detail sd=session.get(Student_detail.class, 1);
		System.out.println(sd);
		
		
		System.out.println(s.getSd());
		
		
		
		session.getTransaction().commit();
		
		
		
	}
}
