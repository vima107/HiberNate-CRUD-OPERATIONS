package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
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
        SessionFactory factory = new Configuration().
        		configure("hibernate.cfg.xml").
        		addAnnotatedClass(Student.class).
        		addAnnotatedClass(Student_detail.class).
        		addAnnotatedClass(Course.class).buildSessionFactory();
        
        Session session=factory.getCurrentSession();
        
        session.beginTransaction();
        
        Student s=session.get(Student.class, 1);
        
        Course c1= new Course("MVC");
        Course c2= new Course("Hibernate");
        Course c3= new Course("CSS");
        
        s.addCourse(c1);
        s.addCourse(c2);
        s.addCourse(c3);
        
        session.save(c1);
        session.save(c2);
        session.save(c3);
        
        session.getTransaction().commit();
    }
}
