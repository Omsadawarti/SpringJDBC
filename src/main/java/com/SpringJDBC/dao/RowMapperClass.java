package com.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.SpringJDBC.entities.Student;
// The purpose to build this class is to implement the RowMapper Interface. you can directly implement this interface to any class, but to make it simple , i have create a different class to implement this interface so the code readability increases.

@Component
public class RowMapperClass implements RowMapper<Student>{

// dont do this
//	@Autowired
//	Student student;
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student(); // every time new object is needed to set different values which are coming form the database.

		student.setId(rs.getInt("id"));;
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setStatus(rs.getInt("status"));
		
		
		
		return student;
	}
}
