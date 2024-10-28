package com.qn.hib.one.one.hibernate_one_to_one_mapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.Student_detail;

public class UpdatingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
									addAnnotatedClass(Student.class).addAnnotatedClass(Student_detail.class).
									buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		session.beginTransaction();
		
		Student s;
		s=session.get(Student.class, 2);
		
		s.setFirst_name("Surya");
		
		System.out.println(s);
		
		Student_detail sd=s.getSd();
		
		sd.setHobby("reading");
		
		System.out.println(sd);
		
		sd=session.get(Student_detail.class, 2);
		
		s=sd.getS();
		
		s.setLast_name("P");
		s.setEmail("Surya411@gmail.com");
		
		System.out.println(s);
		System.out.println(sd);
		
		session.update(sd);
		session.update(s);
		
		session.getTransaction().commit();
	}

}
