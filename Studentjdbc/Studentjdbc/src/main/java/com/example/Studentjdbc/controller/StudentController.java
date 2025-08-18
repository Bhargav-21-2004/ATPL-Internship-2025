package com.example.Studentjdbc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Studentjdbc.Student;
import com.example.Studentjdbc.dao.StudentDAO;
@RestController
@RequestMapping("/api/students")
public class StudentController {
	private final StudentDAO studentDAO;
	public StudentController(StudentDAO studentDAO) {
		this.studentDAO=studentDAO;
	}
	@PostMapping
	public String addStudent(@RequestBody Student student ) {
		int result =studentDAO.insertStudent( student);
		return result == 1 ? "Added sucuessfully":"not added";
	}
	@GetMapping("/alldetails")
	public List<Student> getStudents(){
		return studentDAO.getAllStudents();
	}

}
