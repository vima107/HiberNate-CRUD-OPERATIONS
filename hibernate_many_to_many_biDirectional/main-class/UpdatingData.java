package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
import com.qn.entity.Instructor;
import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class UpdatingData {
		public static void main(String[] args) {
			SessionFactory factory=new Configuration().
					configure("hibernate.cfg.xml").
					addAnnotatedClass(Student.class).
					addAnnotatedClass(Student_detail.class).
					addAnnotatedClass(Course.class).
					addAnnotatedClass(Instructor.class).buildSessionFactory();

			Session session=factory.getCurrentSession();

			session.beginTransaction();

			Instructor i=session.get(Instructor.class, 4);
			i.setEmail("dhoni@gmail.com");
			
			System.out.println(i);
			
			session.update(i);

session.getTransaction().commit();
		}
}
