package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class DeletingData {
		public static void main(String[] args) {
			SessionFactory factory=new Configuration().
										configure("hibernate.cfg.xml").
										addAnnotatedClass(Student.class).
										addAnnotatedClass(Student_detail.class).
										addAnnotatedClass(Course.class).buildSessionFactory();
			
			Session session=factory.getCurrentSession();
			
			session.beginTransaction();
				
			Course c=session.get(Course.class, 16);
			
			session.delete(c);
			
			session.getTransaction().commit();
										
		}
}
