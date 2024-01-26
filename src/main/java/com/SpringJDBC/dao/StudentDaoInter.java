package com.SpringJDBC.dao;

import java.util.List;

import com.SpringJDBC.entities.Student;
// Developing this interface to make our java project loosly coupled, this interface can contain various methods to perform various operations such as insert, update,delete.
public interface StudentDaoInter {

	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	//Method to fetch single record from database.
	public Student getStudent(int studentId);
	
	//Method to fetch multiple record from the Database.
	public List<Student> getAllStudents(); // No need to pass any parameter because we are not fetching record on the basis of some selection condition.
	
}
