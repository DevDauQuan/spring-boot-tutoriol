package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface IStudentService {

	List<Student> getStudents();

	Student findbyId(long id);

	List<Student> createStudent(Student student) throws Exception;

	Student updateStudentbyId(long id, Student student);

	List<Student> deleteStudentById(long id);
}
