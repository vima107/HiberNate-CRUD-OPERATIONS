package com.qn.hib.one.one.hibernate_one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.Student_detail;

/**
 * Hello world!
 *
 */
public class AddingData 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
        						addAnnotatedClass(Student.class).
        						addAnnotatedClass(Student_detail.class).buildSessionFactory();
        
        Session session=factory.getCurrentSession();

        session.beginTransaction();
        
        
        Student s=new Student("Vimal","Kumar","vimalkumarp2002@gmail.com");
        
        
        Student_detail sd=new Student_detail("CS","cycling");
        
        s.setSd(sd);
        sd.setS(s);
        
        session.save(sd);
        session.save(s);
        System.out.println(sd.getS().getEmail());
        session.getTransaction().commit();
    }
}
