package com.qn.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;


// updating in database
public class UpdatingData 
{
    public static void main( String[] args )
    {
        SessionFactory factory =new Configuration().
        							configure("hibernate.cfg.xml").
        							addAnnotatedClass(Student.class).
        							buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        
        session.beginTransaction();
        
       Student s=(Student)session.get(Student.class, 1);
       s.setLastName("Kumar P");
       session.update(s);
        
        session.getTransaction().commit();
        
    }
}
