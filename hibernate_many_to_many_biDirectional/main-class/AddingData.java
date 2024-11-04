package com.qn.hib.one.many.hibernate_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Course;
import com.qn.entity.Instructor;
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
        		addAnnotatedClass(Instructor.class).
        		addAnnotatedClass(Course.class).buildSessionFactory();
        
        Session session=factory.getCurrentSession();
        
        session.beginTransaction();
        
       //Course c= session.get(Course.class, 12);
       Course c= session.get(Course.class, 10);
       
       //Instructor i1=new Instructor("Sachin","Tendulkar","sachin@gmail.com");
       //Instructor i2=new Instructor("Rahul","Dravid","rahul@gmail.com");
       Instructor i3=new Instructor("Virat","Kholi","virat@gmail.com");
       Instructor i4=new Instructor("M.S","Dhoni","rahul@gmail.com");
       
       //i1.addCourse(c);
       //i2.addCourse(c);
       i3.addCourse(c);
       i4.addCourse(c);
       
      // session.save(i1);
      // session.save(i2);
       session.save(i3);
       session.save(i4);
       session.getTransaction().commit();
    }
}
