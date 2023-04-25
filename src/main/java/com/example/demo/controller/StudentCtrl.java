package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;


@RestController
@RequestMapping("api/students")
public class StudentCtrl {

	@Autowired
	IStudentService service;

	@GetMapping("")
	public List<Student> findAll() {
		return service.getStudents();
	}

	@GetMapping("/{id}")
	public Student findbyId(@PathVariable long id) {
		// TODO Auto-generated method stub
		return service.findbyId(id);
	}
	
	@PostMapping("")
	public List<Student> createStudent(@RequestBody Student student) throws Exception {
		// TODO Auto-generated method stub
		return service.createStudent(student);
	}
}
