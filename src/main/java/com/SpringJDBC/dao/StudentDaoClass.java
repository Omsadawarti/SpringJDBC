package com.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.SpringJDBC.entities.Student;

// the purpose to develop this class is to implement the interface which we have developed in order to perform various operation's.....
// the actual logic to perform such operation is written in this class.
// In short the main moto to develop this class is to write the actual logic to perform various operations.



//NOTE: You will needed to create this class object in order to use various methods like insert(); so you have to create the bean of this class either by xml or by using annotation, as per your comfort.

@Component("studentDaoClass")
public class StudentDaoClass implements StudentDaoInter {
	
	
	// in order to perform any operation object of JdbcTemplate class is required, so we have autowired this object in out xml file.
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RowMapperClass rowMapperClass;
	
	public int insert(Student student) {
		String query = "insert into students (name,age,status) values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getName(),student.getAge(),student.getStatus());
		
		
		return result;
	}
	
	public int change(Student student) {
		// Update Operation
		
		String query = "update students set name=? , age = ? , status = ? where id = ?";
		int s = this.jdbcTemplate.update(query,student.getName(),student.getAge(),student.getStatus(),student.getId());
		return s;
	}
	
	
	public int delete(int studentId) {
		String query = "delete from students where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		// Fetch record of single student
		String query = "select * from students where id=?";
	Student s = this.jdbcTemplate.queryForObject(query,rowMapperClass,studentId);
		
		return s;
	}

	public List<Student> getAllStudents() {
		// Fetching all the records from the database
		String query = "select * from students";
		List<Student> students =  this.jdbcTemplate.query(query,rowMapperClass);
		
		return students;
	}
	
	
	
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public StudentDaoClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	

	
	
	
	

}
