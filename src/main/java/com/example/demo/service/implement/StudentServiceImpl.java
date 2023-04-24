package com.example.demo.service.implement;

import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.service.IStudentService;


public class StudentServiceImpl implements IStudentService {
	
	IStudentRepository iStudentRepository = new IStudentRepository();
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return iStudentRepository.getStudents();
	}
	
	
	@Override
	public Student findbyId(long id) {
		// TODO Auto-generated method stub
		return iStudentRepository.findbyId(id);
	}

	@Override
	public List<Student> createStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		return iStudentRepository.createStudent(student);
	}
}
