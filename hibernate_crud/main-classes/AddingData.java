package com.qn.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;


//inserting into database
public class AddingData 
{
    public static void main( String[] args )
    {
        SessionFactory factory =new Configuration().
        							configure("hibernate.cfg.xml").
        							addAnnotatedClass(Student.class).
        							buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        
        session.beginTransaction();
        
        Student s=new Student("Vimal","Kumar","vimakumar38@gmail.com");
        session.save(s);
        
        session.getTransaction().commit();
        
    }
}
