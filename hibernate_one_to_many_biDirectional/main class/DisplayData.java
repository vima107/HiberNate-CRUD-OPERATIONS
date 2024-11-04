package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class DisplayData {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				addAnnotatedClass(Student_detail.class).
				addAnnotatedClass(Course.class).buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		session.beginTransaction();
		
		Course c=session.get(Course.class, 16);
		
		Student s=session.get(Student.class,0);
		
		System.out.println(c);
		//System.out.println(s);
		
		System.out.println(c.getS());
		
		session.getTransaction().commit();
				
	}
}
	

