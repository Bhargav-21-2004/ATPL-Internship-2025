package com.example.Studentjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Studentjdbc.Student;
@Repository
public class StudentDAO {
	private final JdbcTemplate jdbcTemplate;
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public int insertStudent(Student student) {
		String sql="INSERT INTO STUDENT_S (name,email,department) values (?,?,?)";
		return jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getDepartment());
	}
	public List<Student> getAllStudents(){
		String sql="select * from Student_s";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
	}

}
