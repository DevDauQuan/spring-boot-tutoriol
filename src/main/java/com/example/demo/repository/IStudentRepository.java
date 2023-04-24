package com.example.demo.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import com.example.demo.Data;
import com.example.demo.entity.Student;
import com.example.demo.exception.InternalServerErrorException;


public class IStudentRepository  {
	Data data = new Data();
	
	
	public List<Student> getStudents(){
		return data.getStudents();
	}
	
	public Student findbyId(long id){
		for (Student student : data.getStudents()) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	@Autowired
	MessageSource messageSource;
	public List<Student> createStudent(Student student) throws Exception {
		student.setId(data.getStudents().size()+1);
		
		for (Student oldStudent : data.getStudents()) {
			if(oldStudent.getName().equals(student.getName()) ) {
				throw new InternalServerErrorException(this.messageSource.getMessage("error.emailFormat", null, null));
			}
		}
		 data.getStudents().add(student);
		
		 return data.getStudents();
	}
}
