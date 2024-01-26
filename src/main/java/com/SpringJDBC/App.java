package com.SpringJDBC;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJDBC.dao.StudentDaoClass;
import com.SpringJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program is starting its exection.." );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        StudentDaoClass studentDaoClass = context.getBean("studentDaoClass",StudentDaoClass.class);
      //  Student student = new Student();
        // code for Insert and update queries...
//        student.setName("Raghav Gupta");
//        student.setAge(77);
//        student.setStatus(1);
//        student.setId(4);
//        studentDaoClass.change(student);
//        studentDaoClass.insert(student);
        // code for delete query...
//        student.setId(4);
//        
//        studentDaoClass.delete(student.getId());
        
        // code for fetching a single record from the database.
//        Student student = studentDaoClass.getStudent(5);
//        System.out.println(student);
        
        
        // code for fetching multiple records....
       List<Student> studentsList =  studentDaoClass.getAllStudents()	;
       for(Student s:studentsList)
       {
    	   System.out.println(s);
       }
        
        System.out.println("Program has finished it's execution");
    }
}
