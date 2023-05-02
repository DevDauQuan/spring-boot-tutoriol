package com.example.demo.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import com.example.demo.Data;
import com.example.demo.entity.Student;
import com.example.demo.exception.InternalServerErrorException;

@Repository
public class StudentRepository  {
	@Autowired
	private Data data; 

	@Autowired
	private MessageSource messageSource ;
	
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
	
	public Student updateStudentbyId(long id, Student student) {
		for (Student oldStudent : data.getStudents()) {
			if(oldStudent.getId() == id) {
				if (student.getName() != null) {
					oldStudent.setName(student.getName());
	            }
	            if (student.getAddress() != null) {
	            	oldStudent.setAddress(student.getAddress());
	            }
				return oldStudent;
			}
		}
		return null;
	}
	
	public List<Student> deleteStudentById(long id) {
	    data.getStudents().removeIf(student -> student.getId() == id);
	    return data.getStudents();
	}
}
