package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	StudentRepository iStudentRepository ;
	
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


	@Override
	public Student updateStudentbyId(long id, Student student) {
		// TODO Auto-generated method stub
		return iStudentRepository.updateStudentbyId(id, student);
	}


	@Override
	public List<Student> deleteStudentById(long id) {
		// TODO Auto-generated method stub
		return iStudentRepository.deleteStudentById(id);
	}
}
