package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class UpdatingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Student.class).
									addAnnotatedClass(Student_detail.class).
									addAnnotatedClass(Course.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Course c=session.get(Course.class, 10);
		
		c.setTitle("C programming");
		
		System.out.println(c);
		
		Student s=session.get(Student.class, 2);
		
		//System.out.println(s.getC());
		
		session.update(c);
	
		session.getTransaction().commit();
	}

}
